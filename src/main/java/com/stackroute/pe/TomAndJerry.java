package com.stackroute.pe;

public class TomAndJerry {

    public static String check(int input){

        //if input is odd and in between 20 to 30
        if(input%2 != 0 && input >= 20 && input <= 30)
            return ("Tom!");

        //if input is even and in between 20 to 30
        else if(input%2 == 0 && input >= 20 && input <= 30)
            return ("Jerry!");

        else
            return ("Invalid Output");
    }
}
