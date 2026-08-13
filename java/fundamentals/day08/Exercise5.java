// File: java/fundamentals/day08/Exercise5.java
package fundamentals.day08;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int left = 0;
        int right = numbers.length - 1;

        // Two-pointer swap
        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            left++;
            right--;
        }

        // Print elements
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}