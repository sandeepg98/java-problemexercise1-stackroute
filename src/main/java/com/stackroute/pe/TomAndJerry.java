package com.stackroute.pe;

import java.util.Scanner;

public class TomAndJerry {
    public static void main(String[] args){
        int input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        input = sc.nextInt();

        System.out.println(check(input));
    }

    public static String check(int input){
        if(input%2 != 0 && input >= 20 && input <= 30)
            return ("Tom!");
        else if(input%2 == 0 && input >= 20 && input <= 30)
            return ("Jerry!");
        else
            return ("Invalid Output");
    }
}
