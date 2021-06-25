package com.hillel.hometask5_10;

public class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }

    public class Account {
        public String password;

        public Account(String password){
            this.password = password;
        }

        public String displayAccount(){
            return Person.this.name;
        }
    }
}
