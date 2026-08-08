package fundamentals.day01;
import java.util.Scanner;
public class problem4 {
	public static void main(String[] args) {
        final double PI = 3.14159; // Approximation of π
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the radius of the circle: ");
            if (!scanner.hasNextDouble()) {
                System.out.println("Invalid input. Please enter a numeric value.");
                return;
            }

            double radius = scanner.nextDouble();

            // Validate radius
            if (radius < 0) {
                System.out.println("Radius cannot be negative.");
                return;
            }

            // Calculate area
            double area = PI * radius * radius;

            // Display result with 5 decimal places
            System.out.printf("Area of the circle: %.5f%n", area);

        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

