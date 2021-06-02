package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //    String[] array = new String[5];
        ArrayList<String> array = new ArrayList<String>();
        ArrayList <Integer> numList = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            int quantity = (5 - i);
            System.out.println("Введите " + quantity + " любых строк :");
//            array[i] = reader.readLine();
        }

        System.out.println("Ваши строки: ");
        for (String i : array) {
            System.out.print(i + "/ ");
        }
        System.out.println();

//        StringBuffer str = new StringBuffer("a");
//        for (int i = 0; i < array.length; i++) {
//            StringBuffer strBuf = new StringBuffer(array[i]);
//            if(strBuf.equals(str)){
//               str = strBuf;
//            }
//            System.out.println(str);
//        }

//        int m = array.get(0).length();
//        for(String s:array){
//            if (s.array() > m )
        }

    }


