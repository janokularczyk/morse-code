package com.jano;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        char[] english = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L',
                'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X',
                'Y', 'Z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
                ',', '.', '?' };

        String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--.." };

        System.out.print("enter text: ");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.next().toUpperCase();

        char[] chars = userInput.toCharArray();

        String str="";

        for(int i = 0; i < chars.length; i++) {
            for(int j = 0; j < english.length; j++) {
                if (english[j] == chars[i]) {
                    str = str + morse[j] + " ";
                }
            }
        }
        System.out.print("morse: ");
        System.out.println(str);
    }
}
