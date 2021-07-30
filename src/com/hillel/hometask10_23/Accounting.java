package com.hillel.hometask10_23;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;


public class Accounting {

    public static void main(String[] args) throws IOException,InvalidStatusException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input the number of an order");
        String string = reader.readLine().trim();
        Map<Integer, Order> order = new HashMap<>();
        int i = Integer.parseInt(string);

        order.put(1, new Order(OrderStatus.NEW, LocalDateTime.now()));
        order.put(2, new Order(OrderStatus.FINISHED, LocalDateTime.now()));
        order.put(3, new Order(OrderStatus.FINISHED, LocalDateTime.now()));
        order.put(4, new Order(OrderStatus.FAILED, LocalDateTime.now()));
        order.put(5, new Order(OrderStatus.IN_PROGRESS, LocalDateTime.now()));

        while(true){
            if (order.containsKey(i)) {
                System.out.println(order.get(i).getStatus());
                if ((order.get(i).getStatus()).equals(OrderStatus.FINISHED)) {
                    System.out.println("Ok, your order is finished, bye!");
                    break;
                }
            } else if (!order.containsKey(i)) {
                System.out.println("There is no order. Lets create it");
                try {
                    order.put(i, new Order(OrderStatus.NEW, LocalDateTime.now()));
                    System.out.println(order.get(i).getStatus());
                } catch (InvalidStatusException a) {
                    System.out.println("error" + a.getMessage());
                }
            }

            System.out.println("Would u like to change the status of the order?");
            String string1 = reader.readLine().trim().toLowerCase();
            if (string1.equals("yes")) {
                System.out.println("ok, choose: new / in_progress / finished / failed");
                String string2 = reader.readLine().trim().toUpperCase();
                if(string2.equals("new")){
                    throw new InvalidStatusException("u cant make olden status");
                }else {
                    Order order1 = order.get(i);
                    order1.status = OrderStatus.valueOf(string2);
                    order1.updateOfOrder = LocalDateTime.now();
                }
            }
        }
    }
}
