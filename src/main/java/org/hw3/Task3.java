package org.hw3;

public class Task3 {

    public static void Diagonal(int[][] arr) {
        int num = 0;
        for (int i = 0; i <= arr.length - 1; i++) {
            if (num <= arr[i].length - 1) {
                arr[i][num] = 0;
            }
            num += 1;
        }
        for (int i = 0; i <= arr.length - 1; i++) {
            for (int j = 0; j <= arr[i].length - 1; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}, {1, 2, 3, 4, 5}};
        Diagonal(arr);
    }
}