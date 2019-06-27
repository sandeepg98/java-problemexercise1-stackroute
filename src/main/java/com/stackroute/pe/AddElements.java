package com.stackroute.pe;

import java.util.Scanner;

public class AddElements{

    public static void main(String[] args){
        String input;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string of numbers: ");
        input = sc.nextLine();

        System.out.print(addElements(input));
    }


    public static String addElements(String input)
    {
        String[] listNum = input.split(" ");
        int sum=0,count=0;

        for(int i=0; i<listNum.length; i++) {
            if(Character.isLetter(listNum[i].charAt(0))) {
                count=1;
                return "Character found";
            }
            else if(listNum[i].charAt(0)>='0' && listNum[i].charAt(0)<='9')
                sum = sum + Integer.parseInt(listNum[i]);
            else {
                count=1;
                return "Special Character";
            }
        }

        if(count==0)
            return Integer.toString(sum);
        else
            return null;

    }
}