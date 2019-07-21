package com.huy.topica.Java8Demo;

import java.util.Calendar;
import java.util.Date;

public class Product {
    private String id;
    private double price;
    private Calendar MFG;
    private Calendar EXP;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Calendar getMFG() {
        return MFG;
    }

    public void setMFG(Calendar mFG) {
        MFG = mFG;
    }

    public Calendar getEXP() {
        return EXP;
    }

    public void setEXP(Calendar eXP) {
        EXP = eXP;
    }

    public Product(String id, double price, Calendar mfg, Calendar exp) {
        this.id = id;
        this.price = price;
        MFG = mfg;
        EXP = exp;
    }

    @Override
    public String toString() {
        return "Product: " + id + " Price: " + price + " MFG: " + MFG.getTime() + " EXP: " + EXP.getTime();
    }
}
