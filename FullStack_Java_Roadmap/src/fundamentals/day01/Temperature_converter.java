package fundamentals.day01;

import java.util.Scanner;

public class Temperature_converter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // 1. Capital 'S' in System.in

		System.out.print("Enter present Temperature in Celsius: ");
		double celsius = scanner.nextDouble(); // Changed name to 'celsius'

		// 2. Used 'celsius' here so it matches the variable above
		double fahrenheit = (celsius * 9 / 5) + 32;

		System.out.println("\n --- Converted Temperature ---");
		System.out.println("Fahrenheit: " + fahrenheit);

		scanner.close();
	}
}