
package fundamentals.day08;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;

        // Create a new array with size reduced by 1
        int[] newNumbers = new int[numbers.length - 1];

        int index = 0;
        for (int num : numbers) {
            if (num != target) {
                newNumbers[index++] = num;
            }
        }

        // Print elements
        for (int num : newNumbers) {
            System.out.print(num + " ");
        }
    }
}