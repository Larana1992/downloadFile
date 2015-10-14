package com.epam.at.viktoriia_sova.downloads;

import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static com.epam.at.viktoriia_sova.downloads.core.Constants.*;
import static com.epam.at.viktoriia_sova.downloads.core.Properties.*;
import static com.epam.at.viktoriia_sova.downloads.helpers.AssertionHelper.verifyStringEquals;


/**
 * Created by Викуся on 14.10.2015.
 */
public class Tests {

    @Test
    public void test_01() throws MalformedURLException {
        Download download = new Download();
        download.downloadFileByURI(getUrl(), NEW_FILE_PATH);
        verifyStringEquals(NEW_FILE_PATH);
    }
}
