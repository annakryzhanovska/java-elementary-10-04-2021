package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hometask2_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int zer = 0;
        while (!(input= reader.readLine().toLowerCase()).equals("stop")){

            int num;
            num = Integer.parseInt(input);
                zer = zer + num;
        }
        System.out.println(zer);
    }
}
