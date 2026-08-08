package fundamentals.day04;
import java.util.Scanner;
public class Problem5 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input:");
	        int num = scanner.nextInt();

	        boolean isPrime = true;

	        if (num <= 1) {
	            isPrime = false;
	        } else {
	            for (int i = 2; i <= Math.sqrt(num); i++) {
	                if (num % i == 0) {
	                    isPrime = false;
	                    break;
	                }
	            }
	        }

	        if (isPrime) {
	            System.out.println("Prime Number");
	        } else {
	            System.out.println("Not a Prime Number");
	        }

	        scanner.close();
	    }
	}

