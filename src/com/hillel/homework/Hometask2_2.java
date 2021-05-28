package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Hometask2_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("input a number");
        String num = reader.readLine();
        long num2 = Long.parseLong(num);
//        System.out.println(fact(num2));
        System.out.println(recursion(num2));
    }

//    public static int fact(int num2) {
//        if (num2 < 0) {
//            return 0;
//        }
//        int result = 1;
//        if (num2 == 0) {
//            return result;
//        }
//        for (int i = 1; i <= num2; i++) {
//            result = result * i;
//        }
//        return result;
//    }
    public static long recursion(long num2) {
        long result = 1;
        for (int i = 1; i <= num2; i++) {
            result = result * i;
        }
        return result;
    }
}