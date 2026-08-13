// File: java/fundamentals/day08/Problem5.java
package fundamentals.day08;

public class Problem5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 10, 20};
        int target = 10;
        int count = 0;

        for (int num : numbers) {
            if (num == target) {
                count++;
            }
        }

        System.out.println(target + " occurs " + count + " times");
    }
}