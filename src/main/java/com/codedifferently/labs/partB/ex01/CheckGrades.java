package com.codedifferently.labs.partB.ex01;

import java.util.Scanner;

public class CheckGrades {

    public static String checkGrades(int a, int b, int c, int d, int e) {
        String response = "";
            int total = a + b + c + d + e;
            double avg = (double)(total)/5;
            response = "Total grade in five subjects: " + total + "\n My percentage:" + avg;
        return response;
    }

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What was your grade in Math?");
        int a = keyboard.nextInt();
        System.out.println("What was your grade in Science?");
        int b = keyboard.nextInt();
        System.out.println("What was your grade in Geography?");
        int c = keyboard.nextInt();
        System.out.println("What was your grade in English?");
        int d = keyboard.nextInt();
        System.out.println("What was your grade in Java");
        int e = keyboard.nextInt();
        String gradesOutput = checkGrades(a, b, c, d, e);
        System.out.println(gradesOutput);
    }
}