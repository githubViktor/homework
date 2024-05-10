package org.hw1;

public class Task3 {
    public static void selectColor() {
        int data = 15;
        if (data < 10) {
            System.out.println("Красный");
        }

        if ((data >= 10) & (data <= 20)) {
            System.out.println("Желтый");
        }

        if (data > 20) {
            System.out.println("Зеленый");
        }
    }

    public static void main(String[] args) {
        selectColor();
    }
}
