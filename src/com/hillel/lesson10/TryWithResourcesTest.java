package com.hillel.lesson10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesTest {
    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new FileReader("text.txt"))) {
            String line = reader.readLine() ;
            System.out.println("line from file " + line);
        }catch (IOException exception){
            exception.getMessage();
        }
    }
}
