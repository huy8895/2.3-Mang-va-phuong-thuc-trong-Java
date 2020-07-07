package Tinh_tong_cac_so_o_mot_cot;

import java.util.Scanner;

public class SumOfColumn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int colPosition;
        int arrayRow = 3;
        int arrayCol = 3;
        int[][] array = createTwoDimensionalArray(arrayRow, arrayCol);
        showArray(array);

        do {
            System.out.print("Enter col to get Sum: ");
            colPosition = sc.nextInt();
        } while (colPosition > arrayCol);

        int sumCol = sumOfCol(colPosition - 1, array);
        System.out.println("Sum the numbers in a given column is: " + sumCol);

    }

    public static int[][] createTwoDimensionalArray(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }

    public static void showArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }

    public static int sumOfCol(int col, int[][] array) {
        int sum = 0;
        for (int[] ints : array) {
            sum += ints[col];
        }
        return sum;
    }
}
