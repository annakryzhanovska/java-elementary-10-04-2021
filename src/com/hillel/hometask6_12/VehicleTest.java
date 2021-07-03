package com.hillel.hometask6_12;

public class VehicleTest {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("American Airlines Group", 3, 600, 1000, 870);

        airplane.fly();
        airplane.display();
        System.out.println();




        Train train = new Train("Central Japan Railway Company", 12, 160, 1_200, "ТЭМ18");
        train.drive();
        train.display();
        System.out.println();
    }

    public static void airplaneMethod(Vehicle vehicle){
        if(vehicle instanceof Airplane){
            Airplane airplane = (Airplane) vehicle;
            airplane.fly();
        }
    }
}
