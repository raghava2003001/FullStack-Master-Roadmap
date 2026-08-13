package fundamentals.day06;

public class Problem3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Test Case 1: Searching for 30
        int target1 = 30;
        System.out.println("Search for " + target1 + ": " + searchElement(numbers, target1));

        // Test Case 2: Searching for 70
        int target2 = 70;
        System.out.println("Search for " + target2 + ": " + searchElement(numbers, target2));
    }

    public static String searchElement(int[] numbers, int target) {
        for (int number : numbers) {
            if (number == target) {
                return "Found"; // Exit early as soon as the element is matched
            }
        }
        return "Not Found"; // Returned if loop completes without finding target
    }
}