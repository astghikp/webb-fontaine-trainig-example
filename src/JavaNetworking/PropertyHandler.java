package JavaNetworking;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyHandler {
    private static PropertyHandler instance;
    private final Properties properties;

    private PropertyHandler() {
        properties = new Properties();
        try {
            properties.load(new FileInputStream(Constants.PROPERTY));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static PropertyHandler getInstance() {
        if (instance == null)
            instance = new PropertyHandler();
        return instance;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }

    public String getURL() {
        return properties.getProperty("url");
    }

    public String getPicURL() {
        return properties.getProperty("picURL");
    }


}
