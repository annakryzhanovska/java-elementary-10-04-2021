package com.hillel.hometask6_12;

public class Train extends Vehicle {
    private String name;
    public Train(String company, int age, int maxSpeed, int horsepower, String name){
        super(company, age, maxSpeed, horsepower);
        this.name = name;
        System.out.print("name: " + name + ", ");

    }

    public void drive(){
        System.out.println("The airplane drives");
    }

}
