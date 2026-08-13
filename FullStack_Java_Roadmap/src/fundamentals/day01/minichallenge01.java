package fundamentals.day01;

import java.util.Scanner;

public class minichallenge01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inputs
        System.out.print("Enter Student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Clear newline character leftover from nextInt()

        System.out.print("Enter Student course: ");
        String course = scanner.nextLine();

        System.out.print("Enter mark 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter mark 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter mark 3: ");
        double mark3 = scanner.nextDouble();

        // Calculations
        double totalMarks = mark1 + mark2 + mark3;
        double average = totalMarks / 3;

        // Output
        System.out.println("\n --- Student Profile ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average: " + average);

        scanner.close();
    }
}