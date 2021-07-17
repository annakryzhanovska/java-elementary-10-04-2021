package com.hillel.lesson8;

import java.util.ArrayList;

public class UseTest {
    public static void main(String[] args) {
        ArrayList<User> users = new ArrayList<>();
        fillTheList(users);
        printUsers(users);

        removeUserByName(users, getName());
        System.out.println();
        printUsers(users);
    }

    private static void removeUserByName(ArrayList<User> users, String name) {
        for (int i = 0; i < users.size(); i++) {
            User user = users.get(i);
            if (user.getName().equals(name)) {
                users.remove(i);
            }
        }
    }

    private static void printUsers(ArrayList<User> users) {
        for (User user : users) {
            System.out.println(user);
        }
        System.out.println();
    }
    private static String getName() {
        return "Vasya";
    }
    private static void fillTheList(ArrayList<User> users) {
        users.add(new User("Vasya", 19));
        users.add(new User("Kolya", 20));
        users.add(new User("Vitya", 20));
        users.add(new User("Natasha", 20));
        users.add(new User("Oleg", 20));
    }
}
