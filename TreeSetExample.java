package com.example1;

import java.util.Arrays;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
//        Scenario: In a university database,
//        keeping a collection of names or IDs that must be displayed
//        in sorted order,
//        which will help in easier navigation when searching for records.
        TreeSet<String> student = new TreeSet<>(Arrays.asList("Sunil", "Akash", "Venu", "Dharmendra"));
        System.out.println(student);


    }
}
