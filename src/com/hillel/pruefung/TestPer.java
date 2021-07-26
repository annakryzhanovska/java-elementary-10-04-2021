package com.hillel.pruefung;

import java.util.TreeSet;

public class TestPer {
    public static void main(String[] args) {

        PersonComparator comparator = new PersonComparator();
        TreeSet<Person1> people = new TreeSet<Person1>(comparator);
        people.add(new Person1("Tom"));
        people.add(new Person1("Nick"));
        people.add(new Person1("Alice"));
        people.add(new Person1("Bill"));
        for(Person1  p : people){

            System.out.println(p.getName());
        }
    }
}
