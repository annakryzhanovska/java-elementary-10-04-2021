package com.hillel.lesson7.interf;

public class Triangle extends Shape implements Drawable {

    double sideOne;
    double sideTwo;
    double sideThree;

    public Triangle(double sideOne, double sideTwo, double sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    @Override
    public void draw() {
        System.out.println("draw triangle");
    }

    @Override
    public double calculatePerimeter(){
        return sideThree +sideOne + sideTwo;
    }
}
