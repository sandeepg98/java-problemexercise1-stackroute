package com.stackroute.pe;

import java.util.Scanner;

public class VowelsAndConsonants {
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        input = sc.nextLine();

        System.out.println(vowCons(input));
    }

    public static String vowCons(String input){
        int len = input.length();
        String result = "";

        for(int i=0; i<len; i++){
            if(input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u')
                result = result + "Vowel ";
            else
                result = result + "Consonant ";
        }

        return (result);
    }
}

