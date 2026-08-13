package fundamentals.day06;

public class Exercise4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.println("Sum: " + total); // Output: Sum: 150
    }
}