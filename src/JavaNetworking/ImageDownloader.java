package JavaNetworking;

import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class ImageDownloader implements Runnable {
    private final String url; // PropertyHandler.getInstance().getPicURL()
    private final String fileName; // "star.png"
    private ImageDownloadListener listener;

    ImageDownloader(String url, String fileName, ImageDownloadListener listener) {
        this.url = url;
        this.fileName = fileName;
        this.listener = listener;
    }

    public boolean downloadImage() {
        try {
            URL pictureURL = new URL(this.url);
            HttpURLConnection connection = (HttpURLConnection) pictureURL.openConnection();
            InputStream is = connection.getInputStream();
            FileOutputStream fos = new FileOutputStream(this.fileName);
            BufferedInputStream bis = new BufferedInputStream(is);
            byte[] buffer = new byte[1024];
            int read;
            while ((read = bis.read(buffer, 0, buffer.length)) != -1) {
                fos.write(buffer, 0, read);
            }
            fos.flush();
            if(listener != null)
                listener.downloadFinish(this.fileName);
        } catch (IOException e) {
            if(listener != null)
                listener.downloadError();
            e.printStackTrace();
            return false;
        }
        return true;
    }

    @Override
    public void run() {
        if(listener != null)
        {listener.downloadStart();}
        downloadImage();
    }
}
