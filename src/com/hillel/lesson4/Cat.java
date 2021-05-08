package com.hillel.lesson4;

public class Cat {

    String name;
    int age;
    String color;

    //   public Cat(){
//    this.color = "no";
//    this.age = 3;
//    this.name = "Default cat";
//        System.out.println("Cat is created");
//    }

    public Cat(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public static final String DEFAULT_NAME = "Default cat";
    public static final int DEFAULT_AGE = 3;
    public static final String DEFAULT_COLOR = "No color";

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Cat : " + this.name + ", " + this.color + ", " + this.age;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.name.equals(cat.name) && this.age == cat.age;
        }
        return false;
    }
}
