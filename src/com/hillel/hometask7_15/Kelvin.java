package com.hillel.hometask7_15;

public class Kelvin extends Celsius implements Converter {
    public Kelvin(int celsiusNum){
       super(celsiusNum);
    }

    @Override
    public void convert() {
        System.out.println(super.celsiusNum +273);
    }
}
