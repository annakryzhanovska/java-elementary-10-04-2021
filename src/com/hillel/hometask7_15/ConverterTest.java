package com.hillel.hometask7_15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConverterTest {
    public static void main(String[] args) throws IOException {
        System.out.println("Input a number in celsius and put enter: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = reader.readLine();
        int i = Integer.parseInt(string);

        Celsius celsius = new Celsius(i);
        Fahrenheit fahrenheit = new Fahrenheit(i);
        Kelvin kelvin = new Kelvin(i);

        while (true){
            System.out.println("celsius: " + celsius.getCelsiusNum());

            while (true){
                System.out.println("And now works Converter. Input \"fahrenheit\" or \"kelvin\" : ");
                BufferedReader reader1 = new BufferedReader(new InputStreamReader(System.in));
                String string1 = reader1.readLine().toLowerCase().trim();
                switch (string1){
                    case"fahrenheit":
                        fahrenheit.convert();
                        break;
                    case "kelvin":
                        kelvin.convert();
                        break;
                    default:
                        System.out.println("Pls, input а physical quantity");
                        break;
                }
                break;
            }
            break;
        }
    }

}
