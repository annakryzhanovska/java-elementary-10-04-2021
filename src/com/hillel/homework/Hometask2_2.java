package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hometask2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a number");
        String input = reader.readLine();
        long number = Long.parseLong(input);
        System.out.println("Рекурсия ответ " + recursionFactorial(number));
        System.out.println(fact(number));
    }

    static long recursionFactorial(long n) {
        long result = 1;
        if (n == 1 || n == 0) {
            return result;
        }
        result = n * recursionFactorial(n-1);
        return result;
    }

    public static long fact (long num2) {
        long result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * i;
        }
        return result;
    }
}