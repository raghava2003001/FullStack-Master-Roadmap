package fundamentals.day04;

public class Problem2 {
	
	    public static void main(String[] args) {
	        for (int i = 1; i <= 5; i++) {
	            char ch = 'A';
	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch);
	                ch++; // Increment to next letter ('A' -> 'B' -> 'C'...)
	            }
	            System.out.println(); // Move to next line
	        }
	    }
	}
