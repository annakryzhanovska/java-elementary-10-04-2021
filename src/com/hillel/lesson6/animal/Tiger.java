package com.hillel.lesson6.animal;

import com.hillel.lesson6.animal.Animal;

public class Tiger extends Animal {
    public Tiger(String name){
        super(name);
    }

    @Override
    public void speak() {
        System.out.println("Tiger "+ name + " says rrrrrr");
    }
}
