package fundamentals.day01;
import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input seconds
            System.out.print("Enter total seconds: ");
            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter an integer value.");
                return;
            }
            int totalSeconds = sc.nextInt();

            // Handle negative input gracefully
            if (totalSeconds < 0) {
                System.out.println("Seconds cannot be negative.");
                return;
            }

            // Floor division to get minutes
            int minutes = Math.floorDiv(totalSeconds, 60);

            // Remainder to get leftover seconds
            int seconds = totalSeconds % 60;

            // Output result
            System.out.printf("%d seconds = %d minute(s) and %d second(s)%n",
                    totalSeconds, minutes, seconds);

        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}

