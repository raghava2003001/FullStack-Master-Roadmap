package fundamentals.day05;
import java.util.Scanner;
public class MiniChallenge {
	

	    public static double[] getMarks(Scanner scanner, int count) {
	        double[] marks = new double[count];
	        System.out.println("Enter " + count + " subject marks:");
	        for (int i = 0; i < count; i++) {
	            System.out.print("Subject " + (i + 1) + ": ");
	            marks[i] = scanner.nextDouble();
	        }
	        return marks;
	    }

	    public static double calculateTotal(double[] marks) {
	        double total = 0;
	        for (double mark : marks) {
	            total += mark;
	        }
	        return total;
	    }

	    public static double calculateAverage(double total, int count) {
	        return total / count;
	    }

	    public static double findHighest(double[] marks) {
	        double highest = marks[0];
	        for (double mark : marks) {
	            if (mark > highest) highest = mark;
	        }
	        return highest;
	    }

	    public static double findLowest(double[] marks) {
	        double lowest = marks[0];
	        for (double mark : marks) {
	            if (mark < lowest) lowest = mark;
	        }
	        return lowest;
	    }

	    public static String calculateGrade(double average, double[] marks) {
	        for (double mark : marks) {
	            if (mark < 35) return "F (Failed standard)";
	        }
	        if (average >= 90) return "A+";
	        if (average >= 80) return "A";
	        if (average >= 70) return "B";
	        if (average >= 60) return "C";
	        if (average >= 50) return "D";
	        return "F";
	    }

	    public static void printReport(String name, double total, double average, double highest, double lowest, String grade) {
	        System.out.println("\n==============================");
	        System.out.println("      STUDENT REPORT CARD      ");
	        System.out.println("==============================");
	        System.out.println("Name    : " + name);
	        System.out.printf("Total   : %.2f%n", total);
	        System.out.printf("Average : %.2f%n", average);
	        System.out.printf("Highest : %.2f%n", highest);
	        System.out.printf("Lowest  : %.2f%n", lowest);
	        System.out.println("Grade   : " + grade);
	        System.out.println("==============================");
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter Student Name: ");
	        String name = scanner.nextLine();

	        double[] marks = getMarks(scanner, 5);
	        double total = calculateTotal(marks);
	        double average = calculateAverage(total, marks.length);
	        double highest = findHighest(marks);
	        double lowest = findLowest(marks);
	        String grade = calculateGrade(average, marks);

	        printReport(name, total, average, highest, lowest, grade);

	        scanner.close();
	    }
	}

