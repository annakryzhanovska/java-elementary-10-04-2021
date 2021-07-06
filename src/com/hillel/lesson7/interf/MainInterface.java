package com.hillel.lesson7.interf;

import java.util.List;

public class MainInterface {
    public static void main(String[] args) {
        Drawable smth = new Triangle(2, 3, 5);
        Drawable ansmth = new Square(18);
        Drawable wft = new Flower();

        List<Drawable> elements = List.of(smth, ansmth, wft);
        drawAll(elements);
    }

    public static void drawAll(List<Drawable> drawables){
        for (Drawable drawable:drawables) {
            drawable.draw();
        }
    }
}
