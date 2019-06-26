package com.stackroute.pe;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        input = sc.nextLine();

        System.out.print(reverseString(input));
    }

    public static String reverseString(String input){
        if(input == null || input.isEmpty())
            return ("Empty String!!");
        else{
            String rev = "";

            for(int i = input.length()-1; i>=0; i--){
                rev = rev + input.charAt(i);
            }

            return (rev);
        }
    }
}
