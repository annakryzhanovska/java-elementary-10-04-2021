package com.hillel.hometask3_0;

public class Cat {
    String name;
    int age;
    int weight;


    public Cat(String name, int age, int weight) {
        this.name = name ;
        this.age = age;
        this.weight = weight;
    }

//    public boolean equals(Object obj) {
//        if (obj instanceof Cat) {
//            Cat cat = (Cat) obj;
//            return this.age < (cat.age) && this.weight < cat.weight;
//        }
//        return false;
//    }

    public boolean equals(Object object){
        String bob = "bob";
        if(object instanceof Cat){
        Cat cat = ((Cat) object);
        return this.age == cat.age && this.weight < cat.weight;
        }
        return false;
    }

    public String toString(){
        return "Cat "+this.name+ ", age: " + this.age + ", weight: " + this.weight;
    }

}
