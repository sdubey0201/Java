package com.example1;

import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        Scenario: In a university database,
//        keeping a collection of names or IDs that must be displayed
//        in sorted order,
//        which will help in easier navigation when searching for records.
        TreeSet<String> student = new TreeSet<>(Arrays.asList("Sunil", "Akash", "Venu", "Dharmendra"));
        System.out.println(student);

//        2. Range-Based Queries (Subsets)
//        Use case: You need to retrieve
//        subsets of data within a certain range.
//                Example:
//        Storing product prices in a store
//        and fetching products within a price range:
        TreeSet<Integer> price = new TreeSet<>();
        price.add(201);
        price.add(100);
        price.add(300);
        price.add(305);
        price.add(410);
        price.add(105);
        price.add(115);
        SortedSet<Integer> integers = price.subSet(101, 202);
        System.out.println(integers);


    }
}
