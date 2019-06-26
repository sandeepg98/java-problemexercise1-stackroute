package com.stackroute.pe;

import java.util.Scanner;

public class Identify {
    public static void main(String[] args){
        char input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character:");
        input = sc.next().charAt(0);

        System.out.println(identify(input));
    }

    public static String identify(char input){
        if(input >= 97 && input <= 123) {
            return("Lower Case");
        }
        else if(input >= 65 && input <= 96) {
            return("Upper Case");
        }
        else if(input >= 48 && input <= 57) {
            return("Digit");
        }
        else {
            return("Special Character");
        }
    }
}
