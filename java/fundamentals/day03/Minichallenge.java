package fundamentals.day03;
import java.util.Scanner;
import java.math.BigInteger;
public class Minichallenge {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // 1. Ask for user input
	        System.out.print("Enter a positive integer: ");
	        long num = Math.abs(scanner.nextLong());

	        System.out.println("\n--- NUMBER ANALYSIS SYSTEM ---");

	        // 2. Number of Digits
	        String numStr = Long.toString(num);
	        int numDigits = numStr.length();
	        System.out.println("Number of digits: " + numDigits);

	        // 3. Sum of Digits
	        long temp = num;
	        long digitSum = 0;
	        while (temp > 0) {
	            digitSum += temp % 10;
	            temp /= 10;
	        }
	        System.out.println("Sum of digits   : " + digitSum);

	        // 4. Reverse
	        String reversedStr = new StringBuilder(numStr).reverse().toString();
	        long reversedNum = Long.parseLong(reversedStr);
	        System.out.println("Reverse         : " + reversedNum);

	        // 5. Palindrome Check
	        String isPalindrome = numStr.equals(reversedStr) ? "Yes" : "No";
	        System.out.println("Palindrome      : " + isPalindrome);

	        // 6. Factorial (Practical limit: <= 20 for standard 'long' storage)
	        if (num <= 20) {
	            long factorial = 1;
	            for (int i = 1; i <= num; i++) {
	                factorial *= i;
	            }
	            System.out.println("Factorial       : " + factorial);
	        } else {
	            System.out.println("Factorial       : Skipping (Number too large, max limit is 20 for 'long')");
	        }

	        // 7. Multiplication Table (1–10)
	        System.out.println("\nMultiplication Table (1–10):");
	        System.out.println("-------------------------");
	        for (int i = 1; i <= 10; i++) {
	            System.out.printf("%d × %2d = %d%n", num, i, num * i);
	        }

	        scanner.close();
	    }
	}

