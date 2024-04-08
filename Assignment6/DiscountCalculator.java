import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for quantity and price per item
        System.out.print("Enter the quantity purchased: ");
        int quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        double pricePerItem = scanner.nextDouble();

        // Determine the discount rate
        double discountRate;
        if (quantity > 50) {
            discountRate = 0.10; // 10% discount
        } else if (quantity >= 25) {
            discountRate = 0.05; // 5% discount
        } else {
            discountRate = 0.0; // No discount
        }

        // Calculate total cost before discount
        double totalCostBeforeDiscount = quantity * pricePerItem;

        // Calculate discount amount
        double discountAmount = totalCostBeforeDiscount * discountRate;

        // Calculate total expenses after discount
        double totalExpenses = totalCostBeforeDiscount - discountAmount;

        // Display the total expenses
        System.out.printf("Total expenses after discount: $%.2f", totalExpenses);
    }
}
