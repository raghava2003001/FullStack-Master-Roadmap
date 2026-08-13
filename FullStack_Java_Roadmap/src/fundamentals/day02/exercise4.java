package fundamentals.day02;
import java.util.Scanner;
public class exercise4 {
	public static void main(String[] args) {
        final int CORRECT_PIN = 12345; // The correct PIN
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter PIN: ");

        // Validate that the input is an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter numbers only.");
            scanner.close();
            return;
        }

        int enteredPin = scanner.nextInt();

        // Check if entered PIN equals the correct PIN
        if (enteredPin == CORRECT_PIN) {
            System.out.println("Login successful!");
        } 
        // If not equal (!=), login fails
        else if (enteredPin != CORRECT_PIN) {
            System.out.println("Login failed!");
        }

        scanner.close();
    }
}
	

