package com.teachmeskills.lesson12.task1.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * This class contain method for searching acronyms in the text.
 */

public class AcronymSearcher {
    public static void search(String str){
        final String TAG_REGEX = "\\b([A-Z]){2,6}\\b";
        Pattern pattern = Pattern.compile(TAG_REGEX);
        Matcher matcher = pattern.matcher(str);
        while(matcher.find()){
            System.out.println("I found '" + matcher.group() + "' starting at index " +
                       matcher.start() + " and ending at index " + matcher.end() + ".");
        }
    }
}
