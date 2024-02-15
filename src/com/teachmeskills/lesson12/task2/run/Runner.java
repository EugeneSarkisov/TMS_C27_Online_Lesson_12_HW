package com.teachmeskills.lesson12.task2.run;

import com.teachmeskills.lesson12.task2.service.DocSearcher;

public class Runner {
    public static void main(String[] args) {
        String str1 = "From: sample.email.32@gmail.com " +
                "Good day! To continue our conversation I'm sending you " +
                "a copy of contract with number 1234-5123-12. Please check it and give me an answer in any way convenient for you. " +
                "Sincerely yours TMS. +375293455424";
        DocSearcher.searchDocObjects(str1);
    }
}

