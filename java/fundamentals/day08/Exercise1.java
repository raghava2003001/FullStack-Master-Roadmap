package fundamentals.day08;

public class Exercise1 {
    public static void main(String[] args) {
        int[] original = {10, 20, 30, 40};
        int newElement = 50;

        // Create a new array with increased size
        int[] numbers = new int[original.length + 1];

        // Copy elements from original array
        for (int i = 0; i < original.length; i++) {
            numbers[i] = original[i];
        }

        // Assign the new element to the last index
        numbers[numbers.length - 1] = newElement;

        // Print elements
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}