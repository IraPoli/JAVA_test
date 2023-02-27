package org.example.codingTasks;

import java.util.ArrayList;
import java.util.List;

public class NumbersTask {
    public static void swapTwoNumbers() {
        int a = 6, b = 5;
        System.out.println("a- " + a + "; b- " + b);
        a += b;
        b = a - b;
        a = a - b;
        System.out.println("a- " + a + "; b- " + b);
    }

    public static boolean isPrime(int number) {
        boolean result = true;
        if (number == 0 || number == 1) {
            result = false;
        }
        for (int i = 2; i < number/2; i++) {
            if (number % i == 0) {
                result = false;
            }
        }
        return result;
    }

//---------------------------------------
    public static int fibonacciRecursion(int number) {
        if (number <= 1)
            return number;

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }

    public  static void printFibonacci(int number){
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacciRecursion(i) + " ");
        }
    }
   // ----------------------------------------

    public static boolean listContainsOnlyOdd(List<Integer> arrayList) {
        boolean result = true;
        for (var el : arrayList) {
            if (el % 2 != 0) {
                result = false;
                break;
            }
        }
        return result;
    }


}
