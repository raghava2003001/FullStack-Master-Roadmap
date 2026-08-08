package fundamentals.day01;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Fixed capital S

		System.out.print("Enter number 1: ");
		int number1 = scanner.nextInt(); // Fixed dot notation and changed to nextInt()

		System.out.print("Enter number 2: ");
		int number2 = scanner.nextInt(); // Fixed dot notation and changed to nextInt()

		System.out.println("\n--- Calculator ---");
		
		// Use + to combine text and calculations, and use parentheses for correct math order
		System.out.println("Addition: " + (number1 + number2));
		System.out.println("Subtraction: " + (number1 - number2));
		System.out.println("Multiplication: " + (number1 * number2));
		System.out.println("Division: " + (number1 / number2));
		System.out.println("Remainder: " + (number1 % number2));

		scanner.close();
	}
}