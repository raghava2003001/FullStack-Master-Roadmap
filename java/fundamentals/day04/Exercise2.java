package fundamentals.day04;

public class Exercise2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip 5 and proceed to next iteration
            }
            System.out.println(i);
        }
    }
}