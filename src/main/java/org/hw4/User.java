package org.hw4;

public class User {
    private String name;
    private String surname;
    private String secondname;
    private int birth;
    private String email;
    private int age;

    public User(String secondname, String name, String surname, int birth, String email) {
        this.name = name;
        this.surname = surname;
        this.secondname = secondname;
        this.birth = birth;
        this.email = email;
        this.age = 2024 - birth;
    }

    public void info() {
        System.out.println("ФИО: " + surname + ' ' + name + ' ' + secondname + '\n');
        System.out.println("Год рождения: " + birth + '\n');
        System.out.println("e-mail " + email + '\n');

    }

    public void info(int age) {
        if (this.age > age) {
            System.out.println("ФИО: " + surname + ' ' + name + ' ' + secondname + '\n');
            System.out.println("Год рождения: " + birth + '\n');
            System.out.println("e-mail " + email + '\n');
        }

    }

}
