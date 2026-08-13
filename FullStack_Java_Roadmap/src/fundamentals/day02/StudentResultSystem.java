package fundamentals.day02;
import java.util.Scanner;
public class StudentResultSystem {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Marks: ");
        double marks = scanner.nextDouble();

        // Process Grade and Result
        String grade;
        String result;

        if (marks >= 90) {
            grade = "A";
            result = "PASS";
        } else if (marks >= 80) {
            grade = "B";
            result = "PASS";
        } else if (marks >= 70) {
            grade = "C";
            result = "PASS";
        } else if (marks >= 60) {
            grade = "D";
            result = "PASS";
        } else if (marks >= 50) {
            grade = "E";
            result = "PASS";
        } else {
            grade = "F";
            result = "FAIL";
        }

        // Display Output
        System.out.println("\n-------------");
        System.out.println("Student Report\n");
        System.out.println("Name   : " + name);
        if (marks % 1 == 0) {
            System.out.println("Marks  : " + (int) marks);
        } else {
            System.out.println("Marks  : " + marks);
        }
        System.out.println("Grade  : " + grade);
        System.out.println("Result : " + result);

        scanner.close();
    }
}
