package fundamentals.day04;
import java.util.Scanner;

public class Problem4 {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input:");
	        String sentence = scanner.nextLine();

	        String[] words = sentence.split(" ");
	        StringBuilder result = new StringBuilder();

	        for (int i = 0; i < words.length; i++) {
	            // Reverse each individual word
	            String reversedWord = new StringBuilder(words[i]).reverse().toString();
	            result.append(reversedWord);

	            // Add space between words
	            if (i < words.length - 1) {
	                result.append(" ");
	            }
	        }

	        System.out.println(result.toString());
	        scanner.close();
	    }
	}