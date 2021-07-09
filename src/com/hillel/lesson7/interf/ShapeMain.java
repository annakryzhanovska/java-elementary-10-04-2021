package com.hillel.lesson7.interf;

import java.util.List;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape1 = new Square(10);
        Shape shape2 = new Triangle(10, 10, 10);
        System.out.println(shape1.calculatePerimeter());
        shape1.draw();
        Flower flower = new Flower();

        if(shape2 instanceof Erasable){
            Erasable erasable = (Erasable) shape2;
            erasable.erase();
        }

        System.out.println(shape2.calculatePerimeter());
        drawAll(List.of(shape1, shape2, flower));

        smell(flower);
    }

    public static void drawAll(List<Drawable> drawables){
        for (Drawable drawable:drawables) {
            drawable.draw();
        }
    }

    public static void smell(Smelable smelable){
        smelable.smell();
    }
}
