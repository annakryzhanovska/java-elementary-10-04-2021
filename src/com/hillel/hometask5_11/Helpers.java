package com.hillel.hometask5_11;

public class Helpers {

    public static class DistanceHelper{
        public static double getDistance(int x1, int y1, int x2, int y2) {
            return Math.sqrt(Math.pow((x1-x2), 2) * Math.pow ((y2 - x2), 2));
        }
    }

    public static class MathHelper{
        public static double sum(int a, int b){
            return (a+b);
        }
    }

}
