package com.codedifferently.labs.partA.ex01;
import java.util.Scanner;
public class WatchMovie {
    public static String watchMovie(int x, int y) {
        String response ="";
        /* Your code goes here*/
        if(x >= 12 && y == 5){
           return response = "I'm interested in watching the movie";
        }

       return response = "I am not interested in watching the movie";


    }
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the price of the ticket");
        int price = keyboard.nextInt();
        System.out.println("What is the rating of the movie");
        int rate = keyboard.nextInt();
        String movieOutput = watchMovie(price,rate);
        System.out.println(movieOutput);


    }
}
