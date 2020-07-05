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
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
    }
}
