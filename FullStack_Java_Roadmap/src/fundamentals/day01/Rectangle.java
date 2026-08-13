package fundamentals.day01;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Get input from user (using double for decimals)
        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        // 2. Perform math calculations
        double area = length * width;
        double perimeter = 2 * (length + width);

        // 3. Print results
        System.out.println("\n--- Rectangle Results ---");
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        scanner.close();
    }
}