package Mang_hai_chieu_tinh_tong_cac_so_o_duong_cheo;

import java.util.Scanner;

public class SumDiagonalSquareMatrix {
    public static void main(String[] args) {

        int size = 4;
        int[][] twoDimArray;
        int sumDiagonal;
        twoDimArray = createSquareMatrix(size);
        showArray(twoDimArray);
        sumDiagonal = sumDiagonalLine(twoDimArray);
        System.out.print("Sum in the main diagonal of the Square matrix is: " + sumDiagonal);

    }
    public static void showArray(int[][] array) {
        for (int[] ints : array) {
            for (int anInt : ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }
    }
    public static int[][] createSquareMatrix(int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }
        return arr;
    }
    public static int sumDiagonalLine(int[][] array ){
        int sum = 0;
        for (int i = 0; i < array.length;i++){
            for (int j = 0; j < array[i].length;j++){
                if (i == j){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
}
