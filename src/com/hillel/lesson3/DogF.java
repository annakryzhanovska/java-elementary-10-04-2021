package com.hillel.lesson3;

public class DogF {
String breed;
float lenght;
int age;
String color;
String name;

void eat(){
    System.out.println("dog eats");
}
void sleep(){
    System.out.println("dog sleeps");
}

Stick giveStick(){
    Stick stick = new Stick();
    stick.name = "my breautiful stick";
    stick.length = 10;
    return stick;
}

    public void printInfo() {
        System.out.println(this.breed);
        System.out.println(this.age);
        System.out.println(this.lenght);
        System.out.println(this.color);
    }
}
