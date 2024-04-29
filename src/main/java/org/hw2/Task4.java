package org.hw2;

public class Task4 {

    public static void Method(int num, int[] arr) {
        for (int i = 0; i <= arr.length - 1; i++) {
            arr[i] += num;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        Method(45, arr);
    }


}
