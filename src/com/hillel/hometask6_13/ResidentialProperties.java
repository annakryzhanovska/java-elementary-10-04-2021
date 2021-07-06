package com.hillel.hometask6_13;

import java.util.function.Consumer;

public class ResidentialProperties extends Tax {
    //zhilaya nedv
    private int subsidiya;
    private int priceOfProperty = 120;
    public ResidentialProperties(int S, int taxK, int subsidiya, int priceOfProperty){
        super(S, taxK);
    }

    public int getSubsidiya(){
        return subsidiya;
    }
    public void setSubsidiya(int subsidiya){
        this.subsidiya = subsidiya;
    }

    public int getPriceOfProperty(){
        return priceOfProperty;
    }
    public void setPriseOfProperty(int priceOfProperty){
        this.priceOfProperty = priceOfProperty;
    }

    public int taxCalc1(){
        int taxCalc = taxCalculate();
        return taxCalc/getPriceOfProperty();
    }
//    public int taxCalc1 = taxCalc/priceOfProperty;


//    @Override
//    public int taxCalculate(int S, int taxK) {
//        return (S* taxK* subsidiya/ priceOfProperty);
//    }


}
