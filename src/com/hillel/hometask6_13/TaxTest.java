package com.hillel.hometask6_13;

public class TaxTest {
    public static void main(String[] args) {
        IndustrialProperty industrialProperty = new IndustrialProperty(200 , 10);
        System.out.println(industrialProperty.taxCalculate());
        System.out.println();

        ResidentialProperties residentialProperties = new ResidentialProperties(200, 3, 6000, 50);
        System.out.println(residentialProperties.taxCalc1());
        System.out.println();

        RetailProperty retailProperty = new RetailProperty(200, 23, 34);
        System.out.println(retailProperty.taxCalculate());
        System.out.println();
    }
}
