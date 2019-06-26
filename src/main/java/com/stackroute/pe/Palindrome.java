package com.stackroute.pe;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        long input;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        input = sc.nextLong();

        System.out.print(palindrome(input));

    }

    public static String palindrome(long input){
        long rem, sum=0, temp = input;

        while(temp > 0){
            rem = temp%10;
            sum = (sum*10)+rem;
            temp = temp/10;
        }

        if(sum == input) {
            return ("Yes! " + checkSum(sum));
        }
        else
            return ("No");
    }

    public static String checkSum(long num){
        long temp=0, rem;

        while (num>0){
            rem = num%10;
            num = num/10;

            if(rem%2 == 0)
                temp = temp + rem;
        }

        if(temp > 25)
            return ("Sum of even digits is greater than 25");
        else
            return ("Sum of even digits is less than 25");
    }
}
