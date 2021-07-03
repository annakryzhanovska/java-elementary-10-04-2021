package com.hillel.lesson6;

import com.hillel.lesson6.animal.Animal;
import com.hillel.lesson6.animal.Penguin;
import com.hillel.lesson6.animal.Rat;
import com.hillel.lesson6.animal.Tiger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class AnimalTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            System.out.println("Input animal type: ");
            String animalType = bufferedReader.readLine();
            String name = bufferedReader.readLine();
            System.out.println("Input animal name: ");

            if("stop".equals(animalType.toLowerCase(Locale.ROOT))){break;}

            Animal animal;
            switch(animalType){
                case "rat":
                    handleAnimal(new Rat(name));
                    break;
                case "tiger":
                    handleAnimal(new Tiger(name));
                    break;
                case "penguin":
                    handleAnimal(new Penguin(name));
                    break;
                    default:
                        System.out.println("no");
            }
        }



//        Animal rat = new Rat("mike");
//        handleAnimal(rat);
//
//        Animal penguin = new Penguin("sam");
//        handleAnimal(penguin);
//
//        Tiger tiger = new Tiger("Fil");
//        handleAnimal(tiger);
    }

    public static void handleAnimal(Animal animal){
        animal.eat("food");
        animal.speak();

        System.out.println(animal instanceof Animal);
        System.out.println(animal instanceof Rat);

        if(animal instanceof Penguin){
            Penguin penguin = (Penguin) animal;
            penguin.swim();
        }
    }
}
