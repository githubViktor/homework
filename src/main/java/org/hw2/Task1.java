package org.hw2;

public class Task1 {
    public static void Method(int count, String str) {
        for (int i = 1; i <= count; i++) {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Method(5, "someString");
    }

}
