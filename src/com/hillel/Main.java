package com.hillel;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            int quantity = (5 - i);
            System.out.println("Введите " + quantity + " любых строк :");
            array[i] = reader.readLine();
        }

        System.out.println("Ваши строки: ");
        for (String i : array) {
            System.out.print(i + "/ ");
        }
        System.out.println();

        StringBuffer stringBuffer = new StringBuffer ("a");
        for (int i = 0; i < array.length - 1; i++) {
            StringBuffer stringBuffer1 = new StringBuffer(array[i]);
            StringBuffer stringBuffer2 = new StringBuffer(array[i+1]);
            if (stringBuffer1.length() > stringBuffer2.length()+1){
                stringBuffer= stringBuffer1;
            }
        }
        System.out.println("The biggest one is: "+ stringBuffer);
        for (int i = 0; i < array.length - 1; i++) {
            StringBuffer stringBuffer1 = new StringBuffer(array[i]);
            StringBuffer stringBuffer2 = new StringBuffer(array[i+1]);
            if (stringBuffer1.length() < stringBuffer2.length()+1){
                stringBuffer= stringBuffer1;
            }
        }
        System.out.println("The smallest one is : " + stringBuffer);


    }

    }


