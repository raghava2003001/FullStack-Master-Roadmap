package fundamentals.day02;


	import java.util.Scanner;

	public class exercise2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        if (scanner.hasNextDouble()) { // Accepts integers and decimals
	            double number = scanner.nextDouble();

	            if (number > 0) {
	                System.out.println("The number is Positive.");
	            } else if (number < 0) {
	                System.out.println("The number is Negative.");
	            } else {
	                System.out.println("The number is Zero.");
	            }
	        } else {
	            System.out.println("Invalid input. Please enter a valid numeric value.");
	        }

	        scanner.close();
	    }
	}


