package fundamentals.day03;
import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter Number: ");
        int num = scanner.nextInt();
        
        // Print multiplication table from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " × " + i + " = " + (num * i));
        }
        
        scanner.close();
    }
}
