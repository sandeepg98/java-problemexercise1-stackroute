package com.stackroute.pe;

import java.util.Scanner;

public class prob5 {
    public static void main(String[] args){
        int sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Input:");

        while (sc.hasNext()) {
            if (sc.hasNextInt())
                sum = sum + sc.nextInt();
            else
                sc.next();

            System.out.println(sum);
        }
    }
}
