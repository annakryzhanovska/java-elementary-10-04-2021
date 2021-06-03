package com.hillel.homework;

public class Hometask2_3 {
    public static void main(String[] args) {
        int left = Integer.parseInt(args[0]);
        int right = Integer.parseInt(args[2]);
        switch(args[1]){
            case"+":
                System.out.println(left + right);
                break;
            case "-":
                System.out.println(left - right);
                break;
            case "*":
                System.out.println(left * right);
                break;
            case"/":
                System.out.println(left / right);
                break;
            case"%":
                System.out.println(left % right);
                break;
        }
    }
}
