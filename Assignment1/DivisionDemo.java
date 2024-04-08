import java.util.Scanner;

public class DivisionDemo {

    // Method to perform division and handle ArithmeticException
    public static void divideNumbers(int numerator, int denominator) {
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking numerator and denominator as input from the user
        System.out.print("Enter numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Enter denominator: ");
        int denominator = scanner.nextInt();

        // Calling divideNumbers method to perform division
        divideNumbers(numerator, denominator);
    }
}
