package com.hillel.hometask9_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class PlaceOfResidence {
    public static void main(String[] args) throws IOException {
        System.out.println("Input a city and then a lastname of a family: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        Map<String,String> list = new HashMap<>();
        while(true){
            String string = reader.readLine().trim();
            if(string.isEmpty()){
                String inputCity = reader.readLine().trim();
                for(Map.Entry<String, String> arr: list.entrySet()){
                    String city = arr.getKey();
                    String lastname = arr.getValue();
                    if(inputCity.equals(city)){
                        System.out.println(lastname);
                        break;
                    }
                }
            }
        }
    }
}
