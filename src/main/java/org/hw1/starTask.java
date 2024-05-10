package org.hw1;

import java.util.Scanner;

public class starTask {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 1 до 5: ");
        int num = in.nextInt();
        switch (num) {
            case 1:
                Task1.greetings();
            case 2:
                Task2.checkSign((int) (Math.random() * (200 + 1)) - 100, (int) (Math.random() * (200 + 1)) - 100, (int) (Math.random() * (200 + 1)) - 100);
                break;
            case 3:
                Task3.selectColor();
                break;
            case 4:
                Task4.compareNumbers();
                break;
            case 5:
                Task5.addOrSubtractAndPrint((int) (Math.random() * 7), ((int) (Math.random() * 7)), (Math.random() < 0.7));
                break;
        }
    }
}
