package com.teachmeskills.lesson12.task2.constant;

/**
 * This interface contains constants for method "searchDocObjects".
 */

public interface Constant {
    String EMAIL_REGEX = "\\s*([a-z0-9_\\.-]+)@([a-z0-9_\\.-]+)\\.([a-z\\.]{2,6})\\s*";
    String PHONE_REGEX = "\\s*\\+?375((33\\d{7})|(29\\d{7})|(44\\d{7}|)|(25\\d{7}))\\s*";
    String DOC_REGEX = "\\s*[0-9]{4}\\D[0-9]{4}\\D[0-9]{2}\\s*";
}
