package JavaNetworking;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonAPI {
    private static HttpURLConnection connection = null;

    private JsonAPI() {
    }

    //Read json from cache (saved local file) when offline and get from the internet when online (also, save again in the same local file)
    // Testeri hamar em boolean drel funkcianeri return@
    public static boolean saveJsonToFile(String jsonPath, String savePath) {

        try {
            URL url = new URL(jsonPath);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.connect();
            int code = connection.getResponseCode();
            if (code == HttpURLConnection.HTTP_OK) {
                try (InputStream is = connection.getInputStream(); FileOutputStream fis = new FileOutputStream(Constants.JSONDOC)) {
                    int read;
                    while ((read = is.read()) != -1) {
                        fis.write(read);
                    }
                    return true;
                } catch (Exception e) {
                    e.printStackTrace();
                }

            } else {
                System.out.println("code is not 200");
                return false;
            }
        } catch (IOException e) {
            // stex mek a lav chhaskaca inch er petq anel :D
            try {
                FileInputStream fis = new FileInputStream(savePath);
            } catch (FileNotFoundException fileNotFoundException) {
                fileNotFoundException.printStackTrace();
            }

        }
        return true;
    }

    //Convert the json array/object to Java models and print
    public static boolean convertToObject(String jsonPath) {
       try {
           URL url = new URL(jsonPath);
           connection = (HttpURLConnection) url.openConnection();
           connection.setRequestMethod("GET");
           connection.connect();
           if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {

                   JsonData object = new Gson().fromJson(new InputStreamReader(connection.getInputStream()), JsonData.class);
                   System.out.println("json values =" + object);

           } else {
               System.out.println(" problems with json");
               return false;
           }
       }
       catch (Exception e)
       {return false;}
        return true;

    }


}

