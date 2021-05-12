package com.hillel;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader t = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {
            int d = (5 - i);
            System.out.println("Введите " + d + " любых строк: ");
            array[i] = t.readLine();
        }


        System.out.println("Ваши строки: ");
        for (String i : array) {
            System.out.print(i + "/ ");

        }
        System.out.println( );
        Arrays.sort(array, Comparator.comparing(String::length));
        for (String i : array) {
            System.out.print(i + "/ ");

        }
    }
}

