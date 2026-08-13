package fundamentals.day06;

public class Exercise5 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int largest = numbers[0];

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number: " + largest); // Output: Largest number: 50
    }
}