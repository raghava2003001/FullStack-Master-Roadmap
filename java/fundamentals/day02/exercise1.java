package fundamentals.day02;
import java.util.Scanner;
public class exercise1 {
	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");

        int age = scanner.nextInt();

        if(age >= 18) {

            System.out.println("Eligible");

        }

        else {

            System.out.println("Not Eligible");

        }

        scanner.close();

    }

}