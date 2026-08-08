package fundamentals.day03;
import java.util.Scanner;
public class Problem1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input");
	        long num = Math.abs(scanner.nextLong());
	        
	        int count = (num == 0) ? 1 : (int) Math.log10(num) + 1;
	        
	        System.out.println(count);
	        scanner.close();
	    }
	}

