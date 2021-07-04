package com.hillel.hometask6_13;

public class TaxTest {
    public static void main(String[] args) {
        IndustrialProperty industrialProperty = new IndustrialProperty(200 , 3);
        System.out.println(industrialProperty.taxCalculate(200, 3));
        System.out.println();

        ResidentialProperties residentialProperties = new ResidentialProperties(200, 3);
        System.out.println(residentialProperties.taxCalculate(200, 200));
        System.out.println();

        RetailProperty retailProperty = new RetailProperty(200, 4, 266);
        System.out.println(retailProperty.taxCalculate(200, 4));
        System.out.println();
    }
}
