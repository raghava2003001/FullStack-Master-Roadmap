package fundamentals.day05;

public class Problem2 {
    public static String checkEvenOdd(int num) {
        return (num % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(4));   // Output: Even
        System.out.println(checkEvenOdd(-7));  // Output: Odd
        System.out.println(checkEvenOdd(0));   // Output: Even
    }
}