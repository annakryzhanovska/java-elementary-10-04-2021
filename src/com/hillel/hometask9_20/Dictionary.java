package com.hillel.hometask9_20;

import java.time.LocalDate;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


public class Dictionary {
    public static void main(String[] args) {
        Map<String, LocalDate> dictionary = new HashMap<>();

        dictionary.put("Tom", LocalDate.of(2000, 1, 01));
        dictionary.put("Ben", LocalDate.of(2001, 3, 01));
        dictionary.put("Lucy", LocalDate.of(2002, 9, 01));
        dictionary.put("Susie", LocalDate.of(2003, 7, 01));
        dictionary.put("Sam", LocalDate.of(2004, 8, 01));

        System.out.println();
        for (Map.Entry pairEntry: dictionary.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

        System.out.println();
        Iterator<Map.Entry<String,LocalDate>> iterator = dictionary.entrySet().iterator();

        while(iterator.hasNext()){
            Map.Entry<String,LocalDate> pair = iterator.next();
            LocalDate value = pair.getValue();
            int rad = value.getMonthValue();
            if(rad == 7 || rad == 8 || rad == 9)
                iterator.remove();
        }

        for (Map.Entry pairEntry: dictionary.entrySet()){
            System.out.println(pairEntry.getKey() + " : " + pairEntry.getValue());
        }

    }
}
