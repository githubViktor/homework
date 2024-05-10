package org.hw4;

import java.util.Random;


public class Main {
    public static void main(String[] args) {
        User[] users = new User[10];
        Random r = new Random();
        for (int i = 0; i <= 9; i++) {
            int name = (int) (Math.random() * (90 - 65 + 1) + 65);
            int surname = (int) (Math.random() * (90 - 65 + 1) + 65);
            int secondname = (int) (Math.random() * (90 - 65 + 1) + 65);
            int date = (int) (Math.random() * (2000 - 1970 + 1) + 1970);
            users[i] = new User("" + (char) secondname, "" + (char) name, "" + (char) surname, date, (char) name + "@otus.com");
        }

        for (int i = 0; i <= 9; i++) {
            users[i].info(40);
        }

    }

}
