package com.hillel.lesson9;

import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> integers = new Stack<>();
        integers.push(1);
        integers.push(4375676);
        integers.push(56);
        System.out.println(integers);

        System.out.println(integers.peek());
        System.out.println(integers);
    }
}
