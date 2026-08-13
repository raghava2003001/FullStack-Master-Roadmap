package fundamentals.day04;

public class Exercise4 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {       // Outer loop for 3 rows
            for (int j = 1; j <= 3; j++) {   // Inner loop for numbers 1 to 3
                System.out.print(j + " ");
            }
            System.out.println();           // Move to the next line
        }
    }
}