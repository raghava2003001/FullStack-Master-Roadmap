// File: java/fundamentals/day08/Problem2.java
package fundamentals.day08;

public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = {10, -5, 20, -10, 30, 0};

        int positiveCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int num : numbers) {
            if (num > 0) {
                positiveCount++;
            } else if (num < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }

        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);
        System.out.println("Zero: " + zeroCount);
    }
}