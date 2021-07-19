package com.hillel.hometask8_18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Warehouse {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите действие add, remove, exit для выхода: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Product> products = new ArrayList<>();

        while (true) {
            String string = reader.readLine();
            if (string.equals("exit")) {
                break;
            }
            enterProducts(string, reader, products);

        }
    }

    public static void enterProducts(String string, BufferedReader reader, ArrayList<Product> products) throws IOException {
        switch (string.toLowerCase().trim()) {
            case "add":
                System.out.println("Name of the product: ");
                String nameOfProducts = reader.readLine().toLowerCase().trim();

                System.out.println("Quantity of products: ");
                String quantityOfProducts = reader.readLine().toLowerCase().trim();
                int i = Integer.parseInt(quantityOfProducts);

                System.out.println("Weight of products:");
                String weightOfProducts = reader.readLine().toLowerCase().trim();
                int i1 = Integer.parseInt(weightOfProducts);

                System.out.println("Price of products(in $): ");
                String priceOfProducts = reader.readLine().toLowerCase().trim();
                int i2 = Integer.parseInt(priceOfProducts);

                products.add(new Product(nameOfProducts, i, i1, i2));
                System.out.println(products.toString());

                System.out.println();
                System.out.println("Введите действие add, remove, exit для выхода: ");
                break;
            case "remove":
                System.out.println("Input name: ");
                String name = reader.readLine().toLowerCase().trim();

                removeProductsByName(products, name);
                System.out.println("The product was removed ");
                System.out.println(products.toString());
                System.out.println("Введите действие add, remove, exit для выхода: ");
                break;

        }
    }

    private static void removeProductsByName(ArrayList<Product> products, String name) {
        products.removeIf(products1 -> products1.getName().equals(name));
    }

}
