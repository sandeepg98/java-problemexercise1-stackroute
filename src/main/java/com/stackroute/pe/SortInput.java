package com.stackroute.pe;

import java.util.Arrays;

public class SortInput {

    //To sort input
    public static String sortInput(int input){
        String str = Integer.toString(input);
        int number;
        char temp[] = str.toCharArray();

        Arrays.sort(temp);

        number = Integer.parseInt(new String(temp));
        return(reverse(number) + checkSum(number));
    }

    //To reverse input
    public static int reverse(int num){
        int reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed;
    }

    //to check if sum of even digits
    public static String checkSum(long num){
        long temp=0, rem;

        while (num>0){
            rem = num%10;
            num = num/10;

            if(rem%2 == 0)
                temp = temp + rem;
        }

        if(temp > 15)
            return (" and sum of even digits is greater than 15");
        else
            return (" and sum of even digits is less than 15");
    }
}
