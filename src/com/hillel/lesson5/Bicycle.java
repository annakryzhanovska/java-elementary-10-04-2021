package com.hillel.lesson5;

public class Bicycle {
    private static int BICYCLE_COUNT;
    private String model;
    public Bicycle  (String model){
        this.model = "Model S";
    }

    public void ride(){
        System.out.println("ride bicycle " + model);
        BICYCLE_COUNT++;
    }

    public static int bicycleCount(){
        return BICYCLE_COUNT;
    }

    public class SteeringWheel{
        public void left(){
            System.out.println("turn to left" + model);
        }
        public void right(){
            System.out.println("turn to right" + model);
        }
    }
    public class Seat{


        public void down(){
            System.out.println("down");
        }
        public void up(){
            System.out.println("seat up");
        }
    }
}