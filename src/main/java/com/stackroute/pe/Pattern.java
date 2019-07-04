package com.stackroute.pe;

public class Pattern {

    public static String pattern(int input){

        //Create an empty string
        String result = "";

        //Keep adding numbers to the string while looping
        for(int i=1; i<=input; i++){
            for(int j=1; j<=i; j++){
                result = result + (char)(i + '0') + " ";
            }
        }

        return result;
    }
}
