package com.hillel.lesson4;

public class CatTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.age =3;
        cat.color = "gray";

        System.out.println("Cat: " + cat.name + ", " + cat.color + ", " + cat.age );

        Cat cat1 = new Cat ("John", 3, "white");
    }


}
