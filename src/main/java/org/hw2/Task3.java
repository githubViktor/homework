package org.hw2;

import java.util.Arrays;

public class Task3 {

    public static void Method(int num, int[] arr) {
        Arrays.fill(arr, num);
    }

    public static void main(String[] args) {
        int[] arr = new int[15];
        Method(45768436, arr);
    }
}
