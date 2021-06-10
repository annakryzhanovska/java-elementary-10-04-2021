package com.hillel.homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Hometask2_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input;
        String string = " ";
        System.out.println("Input \"stop\" to exit");
        String stop = "stop";
        while (!(input = reader.readLine().toLowerCase()).equals(stop)) {
            string = input + ", " +  string;
        }
        System.out.println(string);
        System.out.println(" ");
        System.out.println(StrBuf(input, stop, reader));

    }

    public static String StrBuf(String input, String stop, BufferedReader reader) throws IOException {
        StringBuffer stringBuffer = new StringBuffer(" ");

        while(!(input = reader.readLine().toLowerCase()).equals(stop)){
            stringBuffer.append(input).append(", ");
        }
        return stringBuffer.toString();
    }
}
