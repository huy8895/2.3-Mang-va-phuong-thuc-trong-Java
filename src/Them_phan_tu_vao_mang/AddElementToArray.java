package Them_phan_tu_vao_mang;

import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class AddElementToArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int newValue;
        int [] arr = createRandomArray();

        System.out.println();
        System.out.print("Enter index position to insert: ");
        index = scanner.nextInt();
        System.out.print("Enter new value :");
        newValue = scanner.nextInt();

        addElement(newValue,index,arr);
        for (int value: arr){
            System.out.print(value + "\t");
        }
    }
    public static int[] createRandomArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of Array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length;i++) {
            arr[i] = (int) (Math.random() * size);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        return arr;
    }

    public static int[] addElement(int value, int index,int[]array){
        for (int i = array.length - 1; i >= index;i--){
            array[i] = array [i - 1];
        }
        array[index] = value;
        return array;
    }
}
