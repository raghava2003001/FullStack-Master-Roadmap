package fundamentals.day06;

public class Problem2 {
    public static void main(String[] args) {
        int[] numbers = {10, 15, 20, 25, 30, 35};
        int count = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                count++;
            }
        }

        System.out.println("Even Numbers: " + count);
    }
}