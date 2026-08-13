package fundamentals.day04;
import java.util.Scanner;
public class Problem3 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input:");
	        String text = scanner.nextLine();

	        // Remove all non-vowels and check length
	        int count = text.replaceAll("(?i)[^aeiou]", "").length();

	        System.out.println("Vowels: " + count);
	        scanner.close();
	    }
	}
