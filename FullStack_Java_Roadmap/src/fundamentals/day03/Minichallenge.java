package fundamentals.day03;

import java.math.BigInteger;
import java.util.Scanner;

public class Minichallenge {
    public static void main(String[] args) {
        // Try-with-resources auto-closes the Scanner when done
        try (Scanner scanner = new Scanner(System.in)) {

            // 1. Ask for user input & validate
            System.out.print("Enter a positive integer: ");
            if (!scanner.hasNextLong()) {
                System.out.println("Invalid input! Please enter a valid integer.");
                return;
            }

            long rawInput = scanner.nextLong();
            // Handle edge case where Long.MIN_VALUE overflows Math.abs()
            long num = (rawInput == Long.MIN_VALUE) ? Long.MAX_VALUE : Math.abs(rawInput);

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
            System.out.println("Reverse         : " + reversedStr);

            // 5. Palindrome Check
            String isPalindrome = numStr.equals(reversedStr) ? "Yes" : "No";
            System.out.println("Palindrome      : " + isPalindrome);

            // 6. Factorial (Using BigInteger to handle values above 20 without limit)
            if (num <= 1000) { // Safe limit to prevent freezing output for massive numbers
                BigInteger factorial = BigInteger.ONE;
                for (long i = 2; i <= num; i++) {
                    factorial = factorial.multiply(BigInteger.valueOf(i));
                }
                System.out.println("Factorial       : " + factorial);
            } else {
                System.out.println("Factorial       : Skipping (Number > 1000 would create excessive output)");
            }

            // 7. Multiplication Table (1–10)
            System.out.println("\nMultiplication Table (1–10):");
            System.out.println("-------------------------");
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d × %2d = %d%n", num, i, num * i);
            }
        }
    }
}