package com.topway.doc.util;

import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

    private static Properties properties = new Properties();

    static {
        try {
            properties.load(PropertyUtil.class.getClassLoader().
                    getResourceAsStream("setting.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getServiceUrl() {
        return (String) properties.get("serviceUrl");
    }

    public static String getClientUrl() {
        return (String) properties.get("clientUrl");
    }

    public static String getProperty(String name){
        return (String) properties.get(name);
    }

}