package com.hillel.hometask5_10;

public class PersonTest {
    public static void main(String[] args) {
        Person person = new Person("Sam");
        String personName = person.getName();
        Person.Account account = person.new Account("ikjnkihn343244j");
        String accountPassword = account.getPassword();

        System.out.println(account.getPassword());

        System.out.println("Name: " + account.displayAccount(person.getName()));

    }
}
