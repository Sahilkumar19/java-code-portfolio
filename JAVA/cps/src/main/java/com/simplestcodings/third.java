package com.simplestcodings;

import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string:");
        String str = in.nextLine();
        String ans = removeVowel(str);
        System.out.println(ans);
    }

    public static String removeVowel(String str) {
        String withoutVowel = "";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < str.length(); i++) {
            if (!vowels.contains(String.valueOf(str.charAt(i)))) {
                withoutVowel += str.charAt(i);
            }
        }

        return withoutVowel;
    }
}

