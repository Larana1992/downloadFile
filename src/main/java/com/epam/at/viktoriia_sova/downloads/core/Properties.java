package com.epam.at.viktoriia_sova.downloads.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.configuration.CompositeConfiguration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class Properties {
    static String configFileName = "config.properties";

    static CompositeConfiguration configuration = loadConfiguration();

    private static CompositeConfiguration loadConfiguration() {
        configuration = new CompositeConfiguration();
        try {
            configuration.addConfiguration(new PropertiesConfiguration(
                    configFileName));
        } catch (final ConfigurationException e) {
            System.out.println("Can't read property");
        }
        return configuration;
    }

    public static String getUrl() {
        return configuration.getString("url");
    }

    public static String getFileName() {
        return configuration.getString("fileName");
    }

    public static String getFormat() {
        return configuration.getString("format");
    }

    public static String getFolderPath() {
        return System.getProperty("user.dir");
    }
}
