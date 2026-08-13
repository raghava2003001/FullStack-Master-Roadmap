// File: java/fundamentals/day08/Problem4.java
package fundamentals.day08;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 5};

        int n = numbers.length + 1;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : numbers) {
            actualSum += num;
        }

        int missing = expectedSum - actualSum;
        System.out.println("Missing: " + missing);
    }
}