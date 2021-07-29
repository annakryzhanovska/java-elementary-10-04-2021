package com.hillel.hometask9_22;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class AnimalTest {
    public static void main(String[] args) {
        Set<Cat> cats = cats();
        Set<Dog> dogs = dogs();
        Set<Animal> j = join(cats, dogs);

        removeCats(j, cats);
        printPets(j);

    }

    public static Set cats() {
        HashSet<Cat> cats = new HashSet<Cat>();
        for (int i = 0; i < 4; i++) {
            cats.add(new Cat());
        }
        return cats;
    }

    public static Set dogs(){
        HashSet<Dog> dogs = new HashSet<Dog>();
        for (int i = 0; i < 3; i++) {
            dogs.add(new Dog());
        }
        return dogs;
    }

    public static Set join(Set<Cat> cats, Set<Dog> dogs){
        HashSet<Animal> animals = new HashSet<Animal>();
        animals.addAll(cats);
        animals.addAll(dogs);
        return animals;
    }

    public static void removeCats(Set<Animal> animals, Set<Cat> cats){
        animals.removeAll(cats);
        System.out.println(animals.size());
    }

    public static void printPets(Set<Animal> animals){
        Iterator iterator = animals.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
