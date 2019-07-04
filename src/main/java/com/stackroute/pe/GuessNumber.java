package com.stackroute.pe;

public class GuessNumber {

    public static String guessNumber(int input, int target){

        //Compare the input and target number
        if(input > target)
            return ("Number guessed is more than original number");

        else if(input < target)
            return ("Number guessed is less than original number");

        else
            return ("Number guessed matches the original number");
    }
}
