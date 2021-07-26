package com.hillel.hometask8_17;

import java.util.Arrays;

public class AL {
    public static void main(String[] args) {
        AL arrayList = new AL();
        arrayList.add("sdgsgf", 2);
        arrayList.add("dfsdf", 1);
        System.out.println(arrayList.get(1));
    }
    private final int INIT_SIZE = 16;
    private Object[] array = new Object[INIT_SIZE];
    public String get(int index) {
        return (String) array[index];
    }
    public void set(int index, String string){
        array[index] = string;

    }
    public void add(String string, int index){
        if(array.length == 0){
            array = Arrays.copyOf(array , array.length*2);
        }
        for (int i = index+1; i<array.length; i++){
            array[i] = array[i+1];
        }
    }
    public void remove(int index) {
        array[index] = null;
        for (int i = index; i<array.length; i++){
            array[i] = array[i+1];
        }
    }
    @Override
    public String toString() {
        return array.toString();
    }
}
