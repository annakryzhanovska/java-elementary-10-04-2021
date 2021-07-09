package com.hillel.hometask7_15;

public class Fahrenheit extends Celsius implements Converter {

    public Fahrenheit(int celsiusNum){
        super(celsiusNum);
    }

    @Override
    public void convert() {
        int celsius = super.celsiusNum;
        int setFahrenheit = (celsius * 9/5)+32;
        System.out.println(setFahrenheit);
    }
}
