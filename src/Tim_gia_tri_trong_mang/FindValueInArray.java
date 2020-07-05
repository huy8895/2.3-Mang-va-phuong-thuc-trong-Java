package Tim_gia_tri_trong_mang;

import java.util.Scanner;

public class FindValueInArray {
    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a name's strudent: ");
        String input_name = scanner.next();

        boolean isExist = false;
        for (int i = 0; i < students.length; i ++){
            if (students[i].equals(input_name)){
                System.out.println("Position of the students in the lists " + input_name + "is: " + (i + 1));
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("NOT found" + input_name + "in the list.");
        }

    }
}
