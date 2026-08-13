package fundamentals.day01;

import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter First number: ");
		int firstNumber = scanner.nextInt();

		System.out.print("Enter Second number: ");
		int secondNumber = scanner.nextInt();

		System.out.println("\n --- Calculator ---");
		System.out.println("Sum: " + (firstNumber + secondNumber));
		System.out.println("Product: " + (firstNumber * secondNumber));

		scanner.close();
	}
}