import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check divisibility by both 7 and 13
        if (number % 7 == 0 && number % 13 == 0) {
            System.out.println(number + " is divisible by both 7 and 13.");

            // Calculate and display quotients and remainders for division by 7 and 13
            int quotient7 = number / 7;
            int remainder7 = number % 7;
            System.out.println("When divided by 7: Quotient = " + quotient7 + ", Remainder = " + remainder7);

            int quotient13 = number / 13;
            int remainder13 = number % 13;
            System.out.println("When divided by 13: Quotient = " + quotient13 + ", Remainder = " + remainder13);
        } else {
            System.out.println(number + " is not divisible by both 7 and 13.");
        }
    }
}
