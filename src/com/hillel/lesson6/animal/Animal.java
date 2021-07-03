package com.hillel.lesson6.animal;

public abstract class Animal {
    String name;
    public Animal(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(String food){
        System.out.println("Animal "+ this.getClass().getSimpleName() + name + " eats " + food);
    }

    public void speak(){

    }

}
