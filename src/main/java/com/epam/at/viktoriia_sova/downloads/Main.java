package com.epam.at.viktoriia_sova.downloads;

import com.epam.at.viktoriia_sova.downloads.core.Constants;

import java.net.MalformedURLException;

import static com.epam.at.viktoriia_sova.downloads.core.Constants.ERROR;
import static com.epam.at.viktoriia_sova.downloads.core.Properties.getUrl;

/**
 * Created by Викуся on 14.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Start work");
            Download download = new Download();
            download.downloadFileByURI(getUrl(), Constants.NEW_FILE_PATH);
            System.out.println("End download");
        } catch (MalformedURLException e) {
            System.err.println(ERROR);
        }
    }
}
