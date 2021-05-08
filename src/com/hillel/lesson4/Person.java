package com.hillel.lesson4;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int age;
    private int money;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName ='" + firstName + '\'' +
                " lastName ='" + lastName + '\'' +
                " age ='" + age +
                " money ='" + money + "$" +
                '}';
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getMoney(){
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void withdrawMoney(Person person) {
        this.money += person.money;
        person.money= 0;
    }

    public Person(String firstName, String lastName, int age, int money){
        this(firstName, lastName, age);
        this.money = money;
    }

}
