package org.hw2;

public class Task2 {

    public static void Method(int[] arr) {
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] > 5) {
                sum += arr[i];
                arr[i] = 0;
            }
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        Method(arr);
    }
}
