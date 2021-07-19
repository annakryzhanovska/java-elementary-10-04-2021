package com.hillel.hometask8_18;

public class Product {
    String name;
    int quantity;
    int weight;
    int price;

    public Product(String name, int quantity, int weight, int price) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getWeight() {
        return weight;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
