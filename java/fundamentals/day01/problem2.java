package fundamentals.day01;

import java.util.Scanner;

public class problem2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter  number: ");
		int number = scanner.nextInt();

		System.out.println("\n --- square cube  ---");
		System.out.println("Square: " + (number * number ));
		System.out.println("cube: " + (number * number * number));

		scanner.close();
	}
}



