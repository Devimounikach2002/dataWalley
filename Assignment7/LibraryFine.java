import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of days late
        System.out.print("Enter the number of days you are late to return the book: ");
        int daysLate = scanner.nextInt();

        // Determine and display the fine or appropriate message
        if (daysLate > 21) {
            System.out.println("Your membership will be canceled due to returning the book significantly late.");
        } else if (daysLate > 14) {
            System.out.println("The fine is Rs. 5.");
        } else if (daysLate > 7) {
            System.out.println("The fine is Rs. 1.");
        } else if (daysLate > 0) {
            System.out.println("The fine is 50 paise.");
        } else {
            System.out.println("No fine is applicable.");
        }
    }
}
