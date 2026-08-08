package fundamentals.day04;

import java.util.Scanner;

public class Minichallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Input Student Name
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        // 2. Input 5 Subject Marks using an array and loop
        double[] marks = new double[5];
        System.out.println("\nEnter 5 Subject Marks:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
        }

        // 3. Calculations
        double total = 0;
        double highest = marks[0];
        double lowest = marks[0];
        boolean isPass = true;

        for (int i = 0; i < marks.length; i++) {
            total += marks[i];

            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            if (marks[i] < 35) { // Subject passing cutoff
                isPass = false;
            }
        }

        double average = total / marks.length;

        // 4. Result and Grade Assignment
        String result = isPass ? "PASS" : "FAIL";
        String grade;

        if (!isPass) {
            grade = "F";
        } else if (average >= 90) {
            grade = "A+";
        } else if (average >= 80) {
            grade = "A";
        } else if (average >= 70) {
            grade = "B";
        } else if (average >= 60) {
            grade = "C";
        } else if (average >= 50) {
            grade = "D";
        } else {
            grade = "E";
        }

        // 5. Formatted Report Output
        System.out.println("\n==============================");
        System.out.println("      STUDENT REPORT CARD      ");
        System.out.println("==============================");
        System.out.println("Name    : " + name);
        System.out.printf("Total   : %.2f%n", total);
        System.out.printf("Average : %.2f%n", average);
        System.out.printf("Highest : %.2f%n", highest);
        System.out.printf("Lowest  : %.2f%n", lowest);
        System.out.println("Grade   : " + grade);
        System.out.println("Result  : " + result);
        System.out.println("==============================");

        scanner.close();
    }
}