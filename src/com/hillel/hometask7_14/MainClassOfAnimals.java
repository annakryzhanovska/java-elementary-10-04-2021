package com.hillel.hometask7_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class MainClassOfAnimals {
    public static void main(String[] args) throws IOException {
        System.out.println("input an animal: tiger, or cat, or dog, or duck");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        CaT cat = new CaT("Sam");
        Duck duck = new Duck("Molly");
        TigeR tiger = new TigeR("Teddy");
        DoG dog = new DoG("Bob");


        while(true){
            String string = reader.readLine();
            if(string.equals(" ")){
                break;
                }

            switch (string.toLowerCase().trim()){
                case "cat":
                    cat.climb();
                    cat.fly();
                    cat.run();
                    break;
                case "dog":
                    dog.climb();
                    dog.fly();
                    dog.run();
                    break;
                case "tiger":
                    tiger.climb();
                    tiger.fly();
                    tiger.run();
                    break;
                case "duck":
                    duck.climb();
                    duck.fly();
                    duck.run();
                    break;
                default:
                    System.out.println(" enter an animal: tiger, or cat, or dog, or duck");
                    break;
            }

        }
    }
}

