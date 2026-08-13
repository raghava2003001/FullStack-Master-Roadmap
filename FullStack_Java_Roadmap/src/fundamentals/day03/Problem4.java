package fundamentals.day03;
import java.util.Scanner;

public class Problem4 {
public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Input");
	        int num = scanner.nextInt();

	        long factorial = 1;
	        for (int i = 1; i <= num; i++) {
	            factorial *= i;
	        }

	        System.out.println(factorial);
	        scanner.close();
	    }
	}

