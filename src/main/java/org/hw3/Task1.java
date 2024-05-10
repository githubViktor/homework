package org.hw3;

public class Task1 {
    public static int sumOfPositiveElements(int[][] arr) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            num = 0;
            for (int j = 0; j <= arr[i].length - 1; j++) {
                num += arr[i][j];
            }
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {-1, 1, -3}, {3, 4, 5}, {0, 0, -1}, {5}, {4, 7}};
        System.out.println(sumOfPositiveElements(arr));
    }
}
