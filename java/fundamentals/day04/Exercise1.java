package fundamentals.day04;

public class Exercise1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 7) {
                break; // Exit loop when i reaches 7
            }
            System.out.println(i);
        }
    }
}