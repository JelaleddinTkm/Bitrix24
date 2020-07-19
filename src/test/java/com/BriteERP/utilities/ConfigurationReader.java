package com.BriteERP.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    /**
     * we created properties object
     * get the path and store in String, or directly pass into fileInputStream obj
     * we need to open the file
     * we need to load the file
     * close.file
     */

    private static Properties properties = new Properties();
    static {
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {

            System.out.println("Properties file not found");
        }

    }

    public static String  getProperties(String keyWord){
        return properties.getProperty(keyWord);

    }

}
