package com.codedifferently.labs.partA.ex03;

import java.util.Scanner;

public class ComputeFare {
    public static int compute (int age){
        int response = 0;
        /* Put your code in between these comments : Top */
        if( age < 11){
            response = 3;
        }else if(age < 65){
            response = 5;
        }else{
            response = 3;
        }

        /* Put your code in between these comments : Bottom */



        return response;
    }
    public static void main(String args[]) {
        int age = 0;
        /* Put your code in between these comments : Top */
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is your age?");
        age = keyboard.nextInt();
        /* Put your code in between these comments : Bottom */

        int computeOutput = compute(age);
        System.out.println("fare= " + computeOutput+"$");


    }
}
