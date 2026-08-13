package fundamentals.day07;

public class Problem1 {
    public static void main(String[] args) {
        String text = "Hello World";
        String vowels = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (vowels.indexOf(text.charAt(i)) != -1) {
                count++;
            }
        }

        System.out.println(count);
    }
}