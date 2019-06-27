package com.stackroute.pe;

import java.util.Scanner;

public class printLoop {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = sc.nextInt();
        System.out.print(utility(num));
    }
    
    public static String utility (int num)
    {
        String pattern = "";
        int i = 0, j = 0;
        for(i=0; i<=num; i++)
            for (j=0; j<i; j++)
                pattern = pattern + " " + i;
        
        return pattern;
    }
}
