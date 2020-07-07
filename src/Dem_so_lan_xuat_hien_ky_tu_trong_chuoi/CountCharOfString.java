package Dem_so_lan_xuat_hien_ky_tu_trong_chuoi;

import java.util.Scanner;

public class CountCharOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = "Counts the number of occurrences of a string";
        System.out.println(str);

        System.out.println("enter a character: ");
        char character = scanner.next().charAt(0);
        int i = FindAndCount(str,character);
        System.out.println(i);
    }
    public static int FindAndCount(String string,char character){
        int count = 0;
        for (int i = 0; i < string.length();i++){
            if (string.indexOf(i)==character){
                count++;
            }
        }
        return count;
    }

}
