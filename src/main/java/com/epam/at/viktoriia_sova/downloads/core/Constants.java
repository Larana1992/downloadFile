package com.epam.at.viktoriia_sova.downloads.core;

import static com.epam.at.viktoriia_sova.downloads.core.Properties.getFileName;
import static com.epam.at.viktoriia_sova.downloads.core.Properties.getFolderPath;
import static com.epam.at.viktoriia_sova.downloads.core.Properties.getFormat;
import static com.epam.at.viktoriia_sova.downloads.helpers.StringHelper.concatString;

/**
 * Created by Викуся on 14.10.2015.
 */
public class Constants {
    public static final String DOT = ".";
    public static final String SLASH = "/";
    public static final String NEW_FILE_PATH = concatString(getFolderPath(), SLASH, getFileName(), DOT, getFormat());
    public static final String ERROR = "Can't download the file";
}
