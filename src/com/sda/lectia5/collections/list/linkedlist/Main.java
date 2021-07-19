package com.sda.lectia5.collections.list.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        linkedListSpecificOperations();
        linkedListInheritedOperations();
    }

    private static void linkedListSpecificOperations() {

        LinkedList<String> visitedCountries = new LinkedList();

        //Linked list specific methods for adding elements
        visitedCountries.addFirst("Spain");
        visitedCountries.push("USA");// Add new element at the front of the list

        visitedCountries.addLast("Romania");
        visitedCountries.offer("Bulgaria");// Add new element at the end front of the list

        //Linked list specific methods for getting first element
        visitedCountries.getFirst();
        visitedCountries.peekFirst();//just another alternative
        visitedCountries.peek();//just another alternative

        //Linked list specific methods for getting last element
        visitedCountries.getLast();//just another alternative
        visitedCountries.peekLast();//just another alternative

        //Linked list specific methods for removing getting first element
        visitedCountries.removeFirst();
        visitedCountries.pollFirst();//just another alternative
        visitedCountries.poll();//just another alternative
        visitedCountries.pop();//just another alternative

        //Linked list specific methods for removing getting last element
        visitedCountries.removeLast();
        visitedCountries.pollLast();
    }

    private static void linkedListInheritedOperations() {
        List<String> visitedCountries = new LinkedList();
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

