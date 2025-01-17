package com.codedifferently.labs.partB.ex02;

public class Ternary {

    public static String ternary(){
        String response = "";
        /* Put your code here */
        int x = 20;
        int y = (x == 1) ? (5):(90);
        System.out.println("value of y is: " + y);
        y = (x == 20) ? (61):(34);
        System.out.println("value of y is: " + y);


        return response;

    }
    public static void main(String args[]) {
        String output = ternary();
        System.out.println(output);

    }
}
