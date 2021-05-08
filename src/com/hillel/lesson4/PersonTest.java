package com.hillel.lesson4;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Sam", "B", 2);
        System.out.println(person);
        if (person.getAge()>=18){
            System.out.println("Can buy alcohol");
        }else{
            System.out.println("Go away!");
        }
        person.setMoney(2);
        System.out.println(person);

        Person person1 = new Person("Ben", "D", 3 );
        System.out.println(person1);
        person.withdrawMoney(person1);

        System.out.println("After withdraw");
        System.out.println(person);
        System.out.println(person1);


    }
}
