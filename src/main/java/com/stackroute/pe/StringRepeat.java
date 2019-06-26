package com.stackroute.pe;

import java.util.Scanner;

public class StringRepeat{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and an integer: ");
        String input1 = sc.next();
        int input2 = sc.nextInt();

        String resultString = stringRepeat(input1, input2);

        System.out.println(resultString);

    }

    public static String stringRepeat(String input1, int input2) {

        String substr = input1.substring(input1.length()-input2);

        for(int i=1; i<=input2; i++) {

            input1=input1 + substr;
        }

        return input1;

    }

}
