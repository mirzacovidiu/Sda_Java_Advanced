package com.sda.lectia5.collections.set.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        setExample();
        setFullExample();
    }

    private static void setExample() {

        Set<String> travelRoute = new HashSet();

        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");
        Iterator var1 = travelRoute.iterator();

        while(var1.hasNext()) {
            String country = (String)var1.next();
            System.out.print(country + " ");
        }

    }

    private static void setFullExample() {
        Set<String> travelRoute = new HashSet();
        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");

        System.out.println("Is Berlin present ? " + travelRoute.contains("Berlin"));
        travelRoute.remove("Paris");
        System.out.println("The number of travel routes is " + travelRoute.size());
        Iterator var1 = travelRoute.iterator();

        while(var1.hasNext()) {
            String country = (String)var1.next();
            System.out.print(country + " ");
        }

        travelRoute.clear();
        System.out.println("Is the travel routes set empty ? " + travelRoute.isEmpty());
    }
}

