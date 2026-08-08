package fundamentals.day05;

public class Exercise4 {

    // Returns a double to handle both integer and decimal values
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        double area = calculateArea(10.0, 5.0);
        System.out.println("Area: " + area);
    }
}