package com.stackroute.pe;

public class StringRepeat{

    //To repeat a portion of string for a given number of times
    public static String stringRepeat(String input1, int input2) {

        String substr = input1.substring(input1.length()-input2);

        for(int i=1; i<=input2; i++) {

            input1=input1 + substr;
        }

        return input1;

    }

}
