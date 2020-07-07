package Gop_mang;

import Them_phan_tu_vao_mang.AddElementToArray;

import java.util.Scanner;

public class MergingArray {
    public static void main(String[] args) {
        int[] arr1 = AddElementToArray.createRandomArray();
        int[] arr2 = AddElementToArray.createRandomArray();
        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println("Array 3: ");
        for (int i = 0; i < arr3.length; i++) {
            if (i < arr1.length) {
                arr3[i] = arr1[i];
            }
            if (i >= arr1.length) {
                arr3[i] = arr2[i - arr1.length];
            }
            System.out.print(arr3[i] + "\t");
        }
    }
}
