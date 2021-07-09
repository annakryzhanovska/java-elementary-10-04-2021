package com.hillel.hometask7_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MainClassOfAnimals {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CaT cat = new CaT("Sam");
        Duck duck = new Duck("Molly");
        TigeR tiger = new TigeR("Teddy");
        DoG dog = new DoG("Bob");
        String string = reader.readLine();
        System.out.println("input an animal: tiger, or cat, or dog, or duck");
        dog.climb();

        while(true){
            if(string.equals(" ")){
                break;
            }
            switch (string.toLowerCase().trim()){
                case "cat":
//                    System.out.println(dog.climb());

            }

        }
    }
}
