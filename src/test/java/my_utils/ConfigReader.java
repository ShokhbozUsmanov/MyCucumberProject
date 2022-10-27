package my_utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties giper = new Properties();

    static {
        try {
            FileInputStream file = new FileInputStream("giper.properties");
            giper.load(file);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static String getProperty(String keyword) {
        return giper.getProperty(keyword);
    }
}
