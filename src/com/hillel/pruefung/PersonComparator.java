package com.hillel.pruefung;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person1> {
    public int compare(Person1 a, Person1 b){

        return a.getName().compareTo(b.getName());
    }
}
