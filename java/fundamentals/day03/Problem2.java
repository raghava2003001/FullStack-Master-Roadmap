package fundamentals.day03;
import java.util.Scanner;

public class Problem2 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input");
	        int num = scanner.nextInt();
	        
	        int n = Math.abs(num);
	        int reversedNum = 0;
	        
	        while (n > 0) {
	            int digit = n % 10;
	            reversedNum = reversedNum * 10 + digit;
	            n /= 10;
	        }
	        
	        // Preserve original sign
	        if (num < 0) {
	            reversedNum = -reversedNum;
	        }
	        
	        System.out.println(reversedNum);
	        scanner.close();
	    }
	}

