package com.huy.topica.Java8Demo;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProductManager {
    
    public static Map<Calendar,Product> mfgMap(List<Product> products, Calendar date){
        return products
                .stream()
                .filter(product -> product.getMFG().after(date))
                .collect(Collectors.toMap(Product::getMFG, product -> product));
    }
    
    public static double sumPrice(List<Product> products) {
        return products
                .stream()
                .map(Product::getPrice)
                .collect(Collectors.summingDouble(Double::doubleValue));
    }
    public static double sumFilteredPrice(List<Product> products, Double minimalPrice) {
        return products
                .stream()
                .map(Product::getPrice)
                .filter(price -> price > minimalPrice )
                .collect(Collectors.summingDouble(Double::doubleValue));
    }
    
    public static int countProduct(List<Product> products, Calendar date) {
        return (int)products
                .stream()
                .filter(product -> product.getEXP().before(date))
                .count();
    }
    
    public static Product findByID(List<Product> products, String id) {
        return products
                .stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
    
    public static int couProductParallel(List<Product> products, Calendar date) {
        return (int)products
                .parallelStream()
                .filter(product -> product.getEXP().before(date))
                .count();
    }
    
}
