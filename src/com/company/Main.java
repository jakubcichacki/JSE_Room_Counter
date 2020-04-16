package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj numer szuaknego elementu: ");
        String numberFromKeyboard = scanner.nextLine();
        int number = Integer.parseInt(numberFromKeyboard);

        System.out.println("Fib (" + number + ") = " + fibIteration(number));
        System.out.println("Fib (" + number + ") = " + fibRecursion(number));

    }

    public static long fibIteration(int number) {
        long fib0 = 0;
        long fib1 = 1;

        if (number == 0)
            return fib0;

        else {
            for (int i = 2; i <= number; i++) {
                fib1 += fib0;
                fib0 = fib1 - fib0;
            }
            return fib1;
        }
    }

    public static long fibRecursion (int number) {
        if (number == 0)
            return 0;

        else if(number == 1)
            return 1;

         else return fibRecursion(number-2)+fibRecursion(number-1);
    }
}
