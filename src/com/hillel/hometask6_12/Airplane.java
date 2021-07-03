package com.hillel.hometask6_12;

public class Airplane extends Vehicle{
    private int passengers;
    public Airplane(String company, int age, int maxSpeed, int horsepower, int p){
        super(company, age, maxSpeed, horsepower);
        this.passengers = p;
        System.out.print("passengers: " + p + ", ");
    }

    public void fly(){
        System.out.println("the airplane flies");
    }

}
