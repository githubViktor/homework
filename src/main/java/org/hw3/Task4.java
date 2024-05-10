package org.hw3;

public class Task4 {

    public static int firstNum(int[][] array) {
        int sum = 0;
        for (int i = 0; i <= array[0].length - 1; i++) {
            sum += array[0][i];
        }
        return sum;
    }

    public static int findMax(int[][] array) {
        int max = firstNum(array);
        int num = 0;
        for (int i = 1; i <= array.length - 1; i++) {
            num = 0;
            for (int j = 0; j <= array[i].length - 1; j++) {
                num += array[i][j];
            }
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 1, 2}, {5, 1, 1}, {1, 1, 5}};
        System.out.println(findMax(arr));

    }
}
