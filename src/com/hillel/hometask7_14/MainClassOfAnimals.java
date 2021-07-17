package com.hillel.hometask7_14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainClassOfAnimals {
    public static void main(String[] args) throws IOException {
        System.out.println("create an animal: tiger, or cat, or dog, or duck");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String string = reader.readLine();
            if(string.equals(" ")){
                break;
            }
            handleAnimal(createAnimal(string));
        }
        }

        public static AllAnimals createAnimal(String string){
            AllAnimals allAnimals = null;
        switch(string.toLowerCase().trim()){
            case "cat":
                allAnimals = new CaT("Sam");
                break;
            case "dog" :
                allAnimals = new DoG("Bob");
                break;
            case "tiger":
                allAnimals = new TigeR("Teddy");
                break;
            case "duck":
                allAnimals = new Duck("Molly");
                break;
            default:
                System.out.println("create an animal one more time pls: tiger, or cat, or dog, or duck");
                break;
        }
            return allAnimals;
        }

        public static void handleAnimal(AllAnimals allAnimals){
        if(allAnimals instanceof DoG){
            DoG dog = (DoG) allAnimals;
            dog.climb();
            dog.run();
        }
        if(allAnimals instanceof CaT){
            CaT cat = (CaT) allAnimals;
                cat.climb();
                cat.run();
            }
        if(allAnimals instanceof TigeR){
            TigeR tigeR = (TigeR) allAnimals;
            tigeR.climb();
            tigeR.run();
            }
        if(allAnimals instanceof Duck){
            Duck duck = (Duck) allAnimals;
            duck.climb();
            duck.run();
            duck.fly();
            }
        }
}

