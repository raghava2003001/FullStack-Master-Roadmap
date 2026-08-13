package fundamentals.day05;

public class Problem4 {
    public static String reverseString(String text) {
        if (text == null) return null; // Null check
        return new StringBuilder(text).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));  // Output: olleh
        System.out.println(reverseString("Java"));   // Output: avaJ
        System.out.println(reverseString("12345"));  // Output: 54321
    }
}