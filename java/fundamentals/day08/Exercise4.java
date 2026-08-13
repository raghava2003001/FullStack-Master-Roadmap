package fundamentals.day08;

import java.util.Arrays;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {50, 20, 40, 10, 30};

        // Sort array in ascending order
        Arrays.sort(numbers);

        // Print elements
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}