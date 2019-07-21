package com.huy.topica.Java8Demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Calendar mfg1 = Calendar.getInstance();
        Calendar exp1 = Calendar.getInstance();
        Calendar mfg2 = Calendar.getInstance();
        Calendar exp2 = Calendar.getInstance();

        mfg1.set(2016, 8, 12);
        exp1.set(2018, 8,12 );
        mfg2.set(2013, 1, 11);
        exp2.set(2020, 1, 11);
        List<Product> products = new ArrayList<>();
        Product product1 = new Product("0001", 200000, mfg1, exp1);
        Product product2 = new Product("0002", 700000, mfg2, exp2);
        Product product3 = new Product("0003", 1000000, mfg1, exp2);
        
        products.add(product1);
        products.add(product2);
        products.add(product3);
        
        Calendar date = Calendar.getInstance();
        date.set(2019, 7, 22);
        
        System.out.println("Sum price of all products: " + ProductManager.sumPrice(products));
        System.out.println("Sum price of all products having price larger than 1200000: "+ ProductManager.sumFilteredPrice(products, 1200000.0));
        System.out.println("The number of all products: "+ ProductManager.countProduct(products, date));
        System.out.println(ProductManager.findByID(products, "0001"));
    }
}
