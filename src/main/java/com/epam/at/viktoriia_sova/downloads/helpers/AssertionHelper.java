package com.epam.at.viktoriia_sova.downloads.helpers;

import java.io.File;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Викуся on 07.10.2015.
 */
public class AssertionHelper {
    public static void verifyStringEquals(String filePath) {
        System.out.println("verified what file is exist");
        assertThat("File doesn't exist",new File(filePath).exists(), is(true));
    }
}
