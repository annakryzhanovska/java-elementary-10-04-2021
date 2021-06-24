package com.hillel.hometask5_10;

public class Person {
    public String name;
    public Person(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public class Account {
        public String password;

        public Account(String password){
            this.password = password;
        }

        public void setPassword(String password){
            this.password = password;
        }
        public String getPassword(){
            return password;
        }

        public String displayAccount(String getName){
            Person.this.name = getName;
            return getName;
        }
    }
}
