package com.sda.lectia5.collections.set.treeset;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<String> travelRoute = new TreeSet();

        new TreeSet(Comparator.comparing(String::length));

        travelRoute.add("Berlin");
        travelRoute.add("Paris");
        travelRoute.add("Madrid");
        travelRoute.add("Cluj");
        travelRoute.add("Paris");
        travelRoute.add("Berlin");
        travelRoute.remove("Paris");
        System.out.println("Is Cluj present ?" + travelRoute.contains("Cluj"));
        travelRoute.remove("Cluj");
        Iterator var3 = travelRoute.iterator();

        while(var3.hasNext()) {
            String country = (String)var3.next();
            System.out.print(country + " ");
        }

        System.out.println("Travel routes in set: " + travelRoute.size());

        travelRoute.clear();

        System.out.println("Is the travel routes set empty ? " + travelRoute.isEmpty());
        TreeSet<String> treeSetTravelRoute = (TreeSet)travelRoute;

        treeSetTravelRoute.add("Berlin");
        System.out.println("First element in set is " + (String)treeSetTravelRoute.first());
        treeSetTravelRoute.add("Cluj");
        System.out.println("Last element in set is " + (String)treeSetTravelRoute.last());
    }
}
