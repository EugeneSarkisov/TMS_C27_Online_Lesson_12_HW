package com.teachmeskills.lesson12.task1.run;

import com.teachmeskills.lesson12.task1.service.AcronymSearcher;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter text: ");
        String str1 = scanner.nextLine(); // "What does IDK, LY, TTYL mean?" - sample string
        AcronymSearcher.search(str1);
        scanner.close();
    }
}
