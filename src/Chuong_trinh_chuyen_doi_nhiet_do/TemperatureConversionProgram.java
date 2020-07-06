package Chuong_trinh_chuyen_doi_nhiet_do;

import java.util.Scanner;

public class TemperatureConversionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double fahrenheit;
        double celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1.Fahrenheit to Celsius");
            System.out.println("2.Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Enter your choice :");
            choice = scanner.nextInt();

            switch (choice){
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter F : ");
                    fahrenheit = scanner.nextInt();
                    System.out.println(fahrenheit + "F = " + fahrenheitToCelsius(fahrenheit) + "F");
                    break;
                case 2:
                    System.out.print("Enter C : ");
                    celsius = scanner.nextInt();
                    System.out.println(celsius + "C = " + celsiusToFahrenheit(celsius) + "F");
                    break;
            }
        } while (choice != 0);


    }
    public static double celsiusToFahrenheit(double celsius){
        return (9.0 / 5)*celsius + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        return (5.0 / 9) * (fahrenheit - 32);
    }
}

