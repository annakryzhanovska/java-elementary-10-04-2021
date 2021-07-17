package com.hillel.lesson8;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList <Integer> integers = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        integers.forEach(System.out::println);
    }
}
