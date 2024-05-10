package org.hw4;

public class Main {
    public static void main(String[] args) {
//        задание с классом User
        User[] users = new User[10];
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

//        задание с коробкой
        Box testbox = new Box("black", 5);
        testbox.getInfo();
        testbox.open(true);
        testbox.put("предмет1");
        testbox.put("предмет2");
        testbox.put("предмет3");
        testbox.get("предмет2");
        testbox.getInfo();
        testbox.put("item1");
        testbox.getInfo();

    }

}
