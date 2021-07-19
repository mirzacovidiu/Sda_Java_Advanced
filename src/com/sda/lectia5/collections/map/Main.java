package com.sda.lectia5.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

    public static void main(String[] args) {
        mapsExample();
 //       mapsFullExample();
//        mapsCustomKey();
    }

    private static void mapsExample() {

        Map<String, String> countries = new HashMap();
        countries.put("Poland", "Warsaw");
        countries.put("Germany", "Berlin");

  //      Iterator var1 = countries.entrySet().iterator();

        for(Map.Entry<String, String> dictionary : countries.entrySet()){
            String country =  dictionary.getKey();
            String capital =  dictionary.getValue();
            System.out.printf("%s : %s\n", country, capital);
        }
        System.out.println(countries.get("Poland"));
    }

    /*private static void mapsCustomKey(){
        // We can create a HashMap with the key of type String and elements of type Product
        Map<ProductMapKey, Product> products = new HashMap<>();
        //And add products to our HashMap
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road Bike", "A bike for comppetition");

        ProductMapKey key = new ProductMapKey("E-Bike", 121);
        products.put(key ,eBike);
        System.out.println(products.get(key));

    }*/

    private static void mapsFullExample() {
        // We can create a HashMap with the key of type String and elements of type Product
        Map<String, Product> productsByName = new HashMap();

        //And add products to our HashMap
        Product eBike = new Product("E-Bike", "A bike with a battery");
        Product roadBike = new Product("Road bike", "A bike for competition");

        productsByName.put(eBike.getName(), eBike);
        productsByName.put(roadBike.getName(), roadBike);

        //We can retrieve a value from the map by its key;
        Product nextPurchase = (Product) productsByName.get("E-Bike");
        System.out.println(nextPurchase);

        //If we try to find a value for a key that doesn't exist in the map, we'll get a null value
        nextPurchase = (Product) productsByName.get("Car");
        System.out.println(nextPurchase);

        Product newEBike = new Product("E-Bike", "A bike with a better battery");
        productsByName.put(newEBike.getName(), newEBike);
        nextPurchase = (Product) productsByName.get("E-Bike");
        System.out.println(nextPurchase);
        Product defaultProduct = new Product("Chocolate", "At least buy chocolate");
        productsByName.put((String) null, defaultProduct);
        nextPurchase = (Product) productsByName.get((Object) null);
        System.out.println(nextPurchase);
        productsByName.put(defaultProduct.getName(), defaultProduct);
        nextPurchase = (Product) productsByName.get(defaultProduct.getName());
        System.out.println(nextPurchase);
        productsByName.remove("E-Bike");
        nextPurchase = (Product) productsByName.get("E-Bike");
        System.out.println(nextPurchase);
        boolean containsEBike = productsByName.containsKey("E-Bike");
        System.out.println("Map contains E-Bike ? " + containsEBike);
        boolean containsValue = productsByName.containsValue(eBike);
        System.out.println("Map contains E-Bike value ? " + containsValue);

        Iterator var8;
        String key;
        Product product;
        for (var8 = productsByName.keySet().iterator(); var8.hasNext(); product = (Product) productsByName.get(key)) {
            key = (String) var8.next();
        }

        String var11;
        Entry entry;
        for (var8 = productsByName.entrySet().iterator(); var8.hasNext(); var11 = (String) entry.getKey()) {
            entry = (Entry) var8.next();
            product = (Product) entry.getValue();
        }

        Product var13;
        for (var8 = productsByName.values().iterator(); var8.hasNext(); var13 = (Product) var8.next()) {
        }

    }
}
