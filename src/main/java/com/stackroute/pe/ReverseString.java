package com.stackroute.pe;

public class ReverseString {

    public static String reverseString(String input){

        //Check for empty string
        if(input == null || input.isEmpty())
            return ("Empty String!!");

        else{
            //Create empty string
            String rev = "";

            //Keep adding elements
            for(int i = input.length()-1; i>=0; i--){
                rev = rev + input.charAt(i);
            }

            return (rev);
        }
    }
}
