package org.example;

public class GIT_Odd_Even_Fixed {
    public static void main(String[] args) {
        int input_num = 7;
        input_num = 8; //override the data after cloning from github
        if(input_num % 2 == 0)
            System.out.println("The input number " + input_num + " is Even...");
        else
            System.out.println("The input number " + input_num + " is Odd...");
    }
}
