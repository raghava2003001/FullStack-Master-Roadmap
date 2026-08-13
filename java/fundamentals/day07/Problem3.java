package fundamentals.day07;

public class Problem3 {
    public static void checkPalindrome(String text) {
        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equalsIgnoreCase(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }

    public static void main(String[] args) {
        checkPalindrome("madam");
        checkPalindrome("hello");
    }
}