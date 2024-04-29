package org.hw2;

public class Task5 {

    public static void Method(int[] arr) {
        int r = 0;
        int l = 0;
        if (arr.length % 2 == 0) {
            for (int i = 0; i <= (arr.length / 2 - 1); i++) {
                r += arr[i];
            }
            for (int i = (arr.length / 2); i <= arr.length - 1; i++) {
                l += arr[i];
            }
            if (r < l) {
                System.out.println("сумма правой половины больше");
            }
            if (r > l) {
                System.out.println("сумма левой половины больше");
            }
            if (r == l) {
                System.out.println("суммы половин равны");
            }
        } else {
            System.out.println(arr.length / 2);
            for (int i = 0; i <= arr.length / 2 - 1; i++) {
                r += arr[i];
            }
            for (int i = arr.length / 2 + 1; i <= arr.length - 1; i++) {
                l += arr[i];
            }
            if (r < l) {
                System.out.println("сумма правой половины больше");
            }
            if (r > l) {
                System.out.println("сумма левой половины больше");
            }
            if (r == l) {
                System.out.println("суммы половин равны");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 8, 5, 1, 7, 3};
        Method(arr);
    }


}
