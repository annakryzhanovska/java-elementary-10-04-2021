package com.hillel.hometask5_10;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Sam");
        Person.Account account = person.new Account("ikjnkihn343244j");

        System.out.println(account.password);

        System.out.println("Name: " + account.displayAccount());

    }
}
