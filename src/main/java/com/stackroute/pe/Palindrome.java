package com.stackroute.pe;

public class Palindrome {

    //Method to check Palindrome
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

    //Method to check if sum of even digits is greater than 25
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
