package fundamentals.day03;
import java.util.Scanner;
public class Problem3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input");
	        int num = scanner.nextInt();

	        String str = Integer.toString(num);
	        String reversedStr = new StringBuilder(str).reverse().toString();

	        if (str.equals(reversedStr)) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not a Palindrome");
	        }

	        scanner.close();
	    }
	}

