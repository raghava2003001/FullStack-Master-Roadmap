package fundamentals.day05;

public class Problem3 {
    public static int countVowels(String text) {
        if (text == null) return 0; // Null check

        int count = 0;
        String lower = text.toLowerCase();
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countVowels("Hello World")); // Output: 3 (e, o, o)
        System.out.println(countVowels("JAVA"));        // Output: 2 (A, A)
        System.out.println(countVowels("rhythm"));      // Output: 0
    }
}