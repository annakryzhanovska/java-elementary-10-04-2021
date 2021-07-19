package com.hillel;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[5];

        for (int i = 0; i < array.length; i++) {
            int quantity = (5 - i);
            System.out.println("Введите " + quantity + " любых строк :");
            array[i] = reader.readLine();
        }

        System.out.println("Ваши строки: ");
        for (String i : array) {
            System.out.print(i + "/ ");
        }
        System.out.println();

        String min = array[0];
        String max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(max.length()< array[i].length()){
                max = array[i];
            }
            if (min.length()> array[i].length()){
                min = array[i];
            }
        }
        System.out.println("The biggest one is: " + max);
        System.out.println("The smallest one is: " + min);
    }




//                Product product = new Product(reader.readLine().toLowerCase().trim());
//    ListIterator listIterator = products.listIterator();
//
//    //                for (ListIterator listIterator = products.listIterator(); listIterator.hasNext();) {
//////                    Product name1 = (Product) iterator.next();
////                    if(listIterator.next().equals(name)){
////                        System.out.println(products.indexOf(listIterator.next()));
//////                        removeProductsByName(products, name);
//////                        products.remove(products.indexOf(listIterator.previous()));
////                        System.out.println("The product was removed ");
////                    }else {
//////                        System.out.println("The product was not found");
////                    }
////                }
//    Iterator<Product> iterator = products.iterator();
//                while (iterator.hasNext()) {
//        Product product1 = iterator.next();
//        if (product1.equals(product)) {
//            products.remove(product1);
//            System.out.println("The product was removed");
//        } else {
//            System.out.println("The product was not found");
//        }
//    }
//                System.out.println(products.toString());
//                System.out.println("Введите действие add, remove, exit для выхода: ");
//                break;

}




