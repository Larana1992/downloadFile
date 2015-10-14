package com.epam.at.viktoriia_sova.downloads;

import com.epam.at.viktoriia_sova.downloads.core.Constants;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static com.epam.at.viktoriia_sova.downloads.core.Constants.*;

/**
 * Created by Викуся on 14.10.2015.
 */
public class Download {

    public void downloadFileByURI(String urlString, String destination) throws MalformedURLException {
        URL website = new URL(urlString);
        try {
            Path target = new File(destination).toPath();
            Files.copy(website.openStream(), target, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
           System.err.println(ERROR);
        }
    }
}
