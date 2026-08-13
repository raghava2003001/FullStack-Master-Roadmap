package fundamentals.day06;

public class Problem1 {
	
	    public static void main(String[] args) {
	        int[] numbers = { 45, 12, 78, 23, 9};
	        int Smallest = numbers[0];

	        for (int number : numbers) {
	            if (number < Smallest) {
	                Smallest = number;
	            }
	        }

	        System.out.println("Smallest number: " + Smallest); // Output: Largest number: 50
	    }
	}

