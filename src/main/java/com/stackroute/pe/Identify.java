package com.stackroute.pe;

public class Identify {

    //Method to check ascii values of the input
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
