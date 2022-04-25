/*
    FizzBuzz - The Game
    -------------------
    This is my second program I wrote in normal Java. I practiced this exercise for my loops.
    I can already do a lot in only 1 hour of leaning Java.
    This is because I already learned a lot by practicing with the ACM library at my school.
    ----------------------
    Author: Emiel De Waele
    Version: v1.0
 */

package com.emieledw;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int SENTINEL = 0;
        int number = 1;
        Scanner sc = new Scanner(System.in);

        while(number != SENTINEL) {
            System.out.print("Enter a number: ");
            number = sc.nextInt();
            if((number % 5 == 0) && (number % 3 == 0)) {
                System.out.println("FizzBuzz");
            } else if(number % 5 == 0) {
                System.out.println("Fizz");
            } else if(number % 3 == 0) {1
                System.out.println("Buzz");
            } else {
                System.out.println(number);
            }
        }
    }
}
