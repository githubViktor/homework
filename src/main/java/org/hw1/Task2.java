package org.hw1;

public class Task2 {
    public static void checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void main(String[] args) {
        checkSign(1, 2, 5);
        checkSign(-1, 2, -234234);
    }
}
