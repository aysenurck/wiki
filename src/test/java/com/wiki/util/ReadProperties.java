package com.wiki.util;

import com.wiki.base.BaseTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {
    static Properties userProperties;
    static {
        userProperties = new Properties();
        try {
            InputStream propertiesStream = BaseTest.class.getClassLoader().getResourceAsStream("user.properties");
            userProperties.load(propertiesStream);
            propertiesStream.close();
            propertiesStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getURL() {
        String url = userProperties.getProperty("_URL");
        return url;
    }

    public static String getSearchWord() {
        String word = userProperties.getProperty("_WORD");
        return word;
    }
}
