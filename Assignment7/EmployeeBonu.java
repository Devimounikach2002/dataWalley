import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input current year and joining year
        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();
        System.out.print("Enter the year the employee joined the organization: ");
        int joiningYear = scanner.nextInt();

        // Calculate years of service
        int yearsOfService = currentYear - joiningYear;

        // Determine and display the bonus
        if (yearsOfService > 5) {
            System.out.println("The employee is awarded a bonus of Rs. 5000/-");
        } else if (yearsOfService >= 3) {
            System.out.println("The employee is awarded a bonus of Rs. 3000/-");
        } else {
            System.out.println("No bonus is awarded.");
        }
    }
}
