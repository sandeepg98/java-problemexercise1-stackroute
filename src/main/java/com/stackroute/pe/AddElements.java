package com.stackroute.pe;

public class AddElements{

    public static String addElements(String input)
    {
        //To handle empty input strings
        if(input.length() == 0)
            return null;

        //Split the input string to get a String array listNum which contains the elements
        String[] listNum = input.split(" ");
        int sum=0, count=0;


        for (int i = 0; i < listNum.length; i++) {
            //To handle alphabet(s) in the input string
            if (Character.isLetter(listNum[i].charAt(0))) {
                count = 1;
                return "Character found";
            }

            //To handle positive numeric values in input string
            else if (listNum[i].charAt(0) >= '0' && listNum[i].charAt(0) <= '9')
                sum = sum + Integer.parseInt(listNum[i]);

            //To handle negative values or any other special character in the input string
            else {
                count = 1;
                return "Special Character Used";
            }
        }


        if(count==0)
            return Integer.toString(sum);
        else
            return null;
    }
}