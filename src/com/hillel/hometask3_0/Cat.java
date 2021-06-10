package com.hillel.hometask3_0;

public class Cat {
    String name;
    int age;
    int weight;

    public Cat(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    public String toString() {
        return ("Cat : " + this.name + ", " + this.age + ", " + this.weight);

    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.age < (cat.age) && this.weight < cat.weight;
        }
        return false;
    }


}
