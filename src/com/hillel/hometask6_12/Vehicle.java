package com.hillel.hometask6_12;

public class Vehicle {

    private String company;
    private int age;
    private int maxSpeed;
    private int horsepower;

    public Vehicle(String c, int a, int mS, int h){
        company = c;
        age = a;
        maxSpeed = mS;
        horsepower = h;
    }

    public String getCompany(){
        return company;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getHorsepower(){
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public Vehicle(int age){
        this.age = age;
    }

    public void display() {
        System.out.println("Company: " + company +", age: " + age + ", max speed: " + maxSpeed + ", horsepower: " + horsepower);

    }
}
