package com.hillel.hometask6_13;

public abstract class Tax {
int  S;
int  taxK;

public Tax(int S, int taxK){
    this.S = S;
    this.taxK = taxK;
}

public int taxCalculate(int S, int taxK){
    return (S * taxK);
}

}
