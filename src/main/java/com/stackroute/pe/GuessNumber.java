package com.stackroute.pe;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args){
        int input, target = 21;
        String result;
        Scanner sc = new Scanner(System.in);
        GuessNumber object = new GuessNumber();

        do{
            System.out.print("Enter Your Guess: ");
            input = sc.nextInt();
            result = object.guessNumber(input, target);
            System.out.println(result);
        }while (!result.equals("Number guessed matches the original number"));
    }

    public static String guessNumber(int input, int target){
        if(input > target)
            return ("Number guessed is more than original number");

        else if(input < target)
            return ("Number guessed is less than original number");

        else
            return ("Number guessed matches the original number");
    }
}
