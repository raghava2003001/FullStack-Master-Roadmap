package fundamentals.day06;

public class Problem4 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Two-pointer algorithm to reverse array in-place
        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        // Print reversed array
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}