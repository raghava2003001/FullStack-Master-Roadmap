package fundamentals.day06;

public class Problem5 {
    public static void main(String[] args) {
        int[] scores = {80, 90, 70, 60, 100};
        int sum = 0;

        for (int score : scores) {
            sum += score;
        }

        // Cast to double to prevent truncation from integer division
        double average = (double) sum / scores.length;

        System.out.println("Average: " + average);
    }
}