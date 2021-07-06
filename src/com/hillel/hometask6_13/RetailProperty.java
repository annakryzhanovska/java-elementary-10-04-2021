package com.hillel.hometask6_13;

public class RetailProperty extends Tax {
    //torgovaya

    private int proceeds;

    public RetailProperty(int S, int taxK, int proceeds) {
        super(S, taxK);
        this.proceeds = proceeds;
    }

    public int getProceeds() {
        return proceeds;
    }

    public void setProceeds(int proceeds) {
        this.proceeds = proceeds;
    }

    @Override
    public int taxCalculate() {
        if (proceeds <= 100) {
            return 0;
        }
        return super.taxCalculate();
    }
}
