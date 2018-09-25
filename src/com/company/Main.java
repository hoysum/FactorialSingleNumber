package com.company;
//Factorial
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner (System.in);
        System.out.println("Enter your number");
        int yourNumber = keyboard.nextInt();  //declare new variable, "yourNumber" to capture keyboard entry
        int Result = factorial(yourNumber); //call your method "Factorial with Parameter

              System.out.println("Result is " + Result);

    }

    public static int factorial(int yourNumber) {

        //factorial = entry x  (entry - 1) until entry =0
        for(int i=yourNumber-1; i>=1; i--) {
           yourNumber= yourNumber*(i); //keep doing this formula (decrementing until

        }
           return yourNumber;


    }
}
