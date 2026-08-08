package fundamentals.day05;

public class Problem5 {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        
        // Optimizing loop condition to avoid Math.sqrt()
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));  // Output: false
        System.out.println(isPrime(2));  // Output: true
        System.out.println(isPrime(29)); // Output: true
        System.out.println(isPrime(35)); // Output: false
    }
}