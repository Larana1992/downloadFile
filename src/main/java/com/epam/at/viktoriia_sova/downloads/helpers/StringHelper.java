package com.epam.at.viktoriia_sova.downloads.helpers;

/**
 * Created by Викуся on 07.10.2015.
 */
public class StringHelper {
    public static String concatString(String... strings) {
        StringBuilder res = new StringBuilder();
        for (String s : strings)
            res.append(s);
        return res.toString();
    }
}
