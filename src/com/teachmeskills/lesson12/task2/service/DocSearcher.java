package com.teachmeskills.lesson12.task2.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.teachmeskills.lesson12.task2.constant.Constant.*;

/**
 * This class contain method "searchDocObjects" for searching email, phone number
 * and doc number in the text.
 */

public class DocSearcher {
    public static void searchDocObjects(String doc) {
        Pattern emailPattern = Pattern.compile(EMAIL_REGEX);
        Pattern phonePattern = Pattern.compile(PHONE_REGEX);
        Pattern docPattern = Pattern.compile(DOC_REGEX);
        Matcher emailMatcher = emailPattern.matcher(doc);
        Matcher phoneMatcher = phonePattern.matcher(doc);
        Matcher docMatcher = docPattern.matcher(doc);
        if (emailMatcher.find() && phoneMatcher.find() && docMatcher.find()) {
            System.out.println("email: " + emailMatcher.group());
            System.out.println("phone number: " + phoneMatcher.group());
            System.out.println("doc number: " + docMatcher.group());
        } else {
            System.out.println("One or more objects are missing");
        }
    }

}
