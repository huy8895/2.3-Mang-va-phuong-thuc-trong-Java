package Tim_gia_tri_lon_nhat_trong_mang;

import java.util.Scanner;

public class GreatestValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] array;
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20){
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);

        array = new int[size];
        for (int i = 0; i < size; i++){
            array[i] = (int)Math.round(Math.random()*20);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int max = array[0];
        int index = 1;
        for (int i = 0; i < array.length;i++ ){
            if (array[i] > max){
                max = array[i];
                index = i + 1;
            }
        }
        System.out.println("The greatest value in array is " + max + " At :" + index);

    }
}
