package fundamentals.day08;

public class Problem3 {
    
}
// File: java/fundamentals/day07/Problem3.java
package fundamentals.day08;

import java.util.ArrayList;
import java.util.List;

public class Problem3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 10, 30, 20, 40};
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int num : numbers) {
            if (!uniqueNumbers.contains(num)) {
                uniqueNumbers.add(num);
            }
        }

        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }
    }
}