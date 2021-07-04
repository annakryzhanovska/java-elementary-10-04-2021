package com.hillel.hometask6_13;

public class ResidentialProperties extends Tax {
    //zhilaya nedv
    private int subsidiya;
    private int priceOfProperty = 120;
    public ResidentialProperties(int S, int taxK){
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

    @Override
    public int taxCalculate(int S, int taxK) {
        return (S* taxK* subsidiya/ priceOfProperty);
    }


}
