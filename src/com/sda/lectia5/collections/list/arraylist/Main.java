package com.sda.lectia5.collections.list.arraylist;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        listExample();
        listIteratorExample();
        listSortExample();
        listFullExample();
    }

    private static void listExample() {
        List<String> visitedCountries = new ArrayList();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");
        visitedCountries.remove("France");
        Iterator var1 = visitedCountries.iterator();

        while(var1.hasNext()) {
            String country = (String)var1.next();
            System.out.print(country + " ");
        }

    }

    private static void listIteratorExample() {
        List<String> visitedCountries = new ArrayList();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");
        visitedCountries.remove("France");

        //prints Germany, Spain, as "France" was removed
        Iterator iterator = visitedCountries.iterator();

        while(iterator.hasNext()) {
            if(iterator.next().equals("Spain")){
                iterator.remove();
            }
   //         System.out.print((String)iterator.next() + " ");
        }

    }

    private static void listSortExample() {
        List<Integer> numbers = new ArrayList();
        numbers.add(9);
        numbers.add(10);
        numbers.add(1);
        numbers.add(5);

        System.out.println("List before sort " + numbers);

        numbers.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int result = Integer.compare(o2, o1);
                String sign;
                if (result == -1) {
                    sign = "=";
                } else {
                    sign = ">";
                }
                System.out.println(o1 + sign + o2);
                //        return Integer.compare(o1, o2);
                return Integer.compare(o2, o1);
            }
        });
        System.out.println("List after sort " + numbers);
    }

    private static void listFullExample() {
        List<String> visitedCountries = new ArrayList();
        visitedCountries.add("Germany");
        visitedCountries.add("France");
        visitedCountries.add("Spain");
        visitedCountries.add(0, "USA");
        System.out.println((String)visitedCountries.get(1));
        System.out.println("I've visited " + visitedCountries.size() + " countries");
        System.out.println("I've visited Germany ? " + visitedCountries.contains("Germany"));
        System.out.println("I've visited Australia ? " + visitedCountries.contains("Australia"));
        Iterator var1 = visitedCountries.iterator();

        while(var1.hasNext()) {
            String country = (String)var1.next();
            System.out.print(country + " ");
        }

        for(int i = 0; i < visitedCountries.size(); ++i) {
            System.out.print((String)visitedCountries.get(i) + " ");
        }

        visitedCountries.remove("France");
        visitedCountries.remove(1);
        visitedCountries.clear();
        System.out.println("I've visited " + visitedCountries.size() + "countries");
        System.out.println("Is the visited country list empty ?" + visitedCountries.isEmpty());
    }
}
