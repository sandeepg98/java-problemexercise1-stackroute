package com.stackroute.pe;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args){
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        input = sc.nextInt();

        System.out.println(pattern(input));
    }

    public static String pattern(int input){
        String result = "";
        for(int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                result = result + (char)(i + '0') + " ";
            }
        }

        return result;
    }
}
