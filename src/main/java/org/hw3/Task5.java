package org.hw3;

public class Task5 {
    public static boolean isSecondString(int[][] array) {
        int sum = 0;
        if (array.length - 1 >= 1) {
            return true;
        }
        return false;
    }

    public static int secondStringSum(int[][] array) {
        boolean secondStringCheker = isSecondString(array);
        int sum = 0;
        if (secondStringCheker) {
            for (int i = 0; i <= array[1].length - 1; i++) {
                sum += array[1][i];
            }
            return sum;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {1, 2, 53543, 4, 5}, {1, 2, 3, 4, 5, 6, 7, 8, 9}};
        System.out.println(secondStringSum(arr));
    }
}
