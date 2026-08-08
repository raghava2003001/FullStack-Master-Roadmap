package fundamentals.day05;

public class Problem1 {
    public static int getLargest(int a, int b) {
        return Math.max(a, b);
    }

    public static void main(String[] args) {
        System.out.println(getLargest(10, 20));  // Output: 20
        System.out.println(getLargest(-5, -12)); // Output: -5
        System.out.println(getLargest(7, 7));    // Output: 7
    }
}