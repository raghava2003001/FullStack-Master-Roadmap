package fundamentals.day07;

public class Exercise4 {
    public static void main(String[] args) {
        String text = "programming";
        char target = 'g';
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }

        System.out.println(count);
    }
}