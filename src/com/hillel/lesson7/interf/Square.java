package com.hillel.lesson7.interf;

public class Square extends Shape implements Drawable{

    double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public void draw(){
        System.out.println("draw triangle");
    }

    @Override
    public double calculatePerimeter() {
        return side+4;
    }
}
