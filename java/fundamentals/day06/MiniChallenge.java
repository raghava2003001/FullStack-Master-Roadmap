package fundamentals.day06;

public class MiniChallenge {

	    public static void main(String[] args) {
	        int[] marks = {85, 72, 91, 68, 88};

	        int total = 0;
	        int highest = marks[0];
	        int lowest = marks[0];
	        int passed = 0;
	        int failed = 0;

	        // Loop to calculate all metrics in a single pass
	        for (int mark : marks) {
	            total += mark;

	            // Track highest mark
	            if (mark > highest) {
	                highest = mark;
	            }

	            // Track lowest mark
	            if (mark < lowest) {
	                lowest = mark;
	            }

	            // Pass/Fail evaluation (Passing mark = 35)
	            if (mark >= 35) {
	                passed++;
	            } else {
	                failed++;
	            }
	        }

	        double average = (double) total / marks.length;
	        String result = (failed == 0) ? "PASS" : "FAIL";

	        // Formatted Output
	        System.out.println("==============================");
	        System.out.println("       MARKS ANALYZER        ");
	        System.out.println("==============================");
	        
	        System.out.print("Marks   : ");
	        for (int i = 0; i < marks.length; i++) {
	            System.out.print(marks[i] + (i < marks.length - 1 ? " " : ""));
	        }
	        System.out.println();

	        System.out.println("Total   : " + total);
	        System.out.printf("Average : %.2f%n", average);
	        System.out.println("Highest : " + highest);
	        System.out.println("Lowest  : " + lowest);
	        System.out.println("Passed  : " + passed);
	        System.out.println("Failed  : " + failed);
	        System.out.println("Result  : " + result);
	        System.out.println("==============================");
	    }
	}
