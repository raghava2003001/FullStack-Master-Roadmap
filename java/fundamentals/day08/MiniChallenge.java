// File: java/fundamentals/day08/MiniChallenge.java
package fundamentals.day08;

import java.util.Arrays;

public class MiniChallenge {
    public static void main(String[] args) {
        int[] marks = {85, 72, 91, 68, 88};

        int total = 0;
        int highest = marks[0];
        int lowest = marks[0];
        int passed = 0;
        int failed = 0;
        int passMark = 35;

        for (int mark : marks) {
            total += mark;
            if (mark > highest) highest = mark;
            if (mark < lowest) lowest = mark;

            if (mark >= passMark) {
                passed++;
            } else {
                failed++;
            }
        }

        double average = (double) total / marks.length;
        String result = (failed == 0) ? "PASS" : "FAIL";

        // Create a sorted copy of the original array
        int[] sortedMarks = marks.clone();
        Arrays.sort(sortedMarks);

        // Display results
        System.out.println("==============================");
        System.out.println("     STUDENT MARKS ANALYZER");
        System.out.println("==============================");

        System.out.print("Marks       : ");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();

        System.out.println("Total       : " + total);
        System.out.printf("Average     : %.2f%n", average);
        System.out.println("Highest     : " + highest);
        System.out.println("Lowest      : " + lowest);
        System.out.println("Passed      : " + passed);
        System.out.println("Failed      : " + failed);
        System.out.println("Result      : " + result);

        System.out.print("Sorted      : ");
        for (int mark : sortedMarks) {
            System.out.print(mark + " ");
        }
        System.out.println();
        System.out.println("==============================");
    }
}