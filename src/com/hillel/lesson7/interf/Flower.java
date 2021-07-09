package com.hillel.lesson7.interf;

public class Flower implements Drawable, Smelable{

    @Override
    public void draw(){
        System.out.println("draw flower");
    }

    @Override
    public void smell() {
        System.out.println("smells nice.");
    }
}
