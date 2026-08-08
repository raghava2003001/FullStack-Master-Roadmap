package fundamentals.day02;
import java.util.Scanner;
public class exercise5 {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		// Input two numbers
		System.out.print("Enter the first number: ");
		int num1 = scanner.nextInt();
		System.out.print("Enter the second number: ");
		int num2 = scanner.nextInt();

		// Determine and print the largest number
		if (num1 > num2) {
		System.out.println("The largest number is: " + num1);
		} else {
		System.out.println("The largest number is: " + num2);
	}
}
}
