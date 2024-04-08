import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variables to hold the smallest and largest numbers, initialized to maximum and minimum values possible
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        
        // Variables to hold the total sum and count of numbers entered
        double sum = 0;
        int count = 0;
        
        // Loop to continuously read numbers from the user
        while (true) {
            System.out.print("Enter a number (or type 'stop' to finish): ");
            String input = scanner.nextLine();
            
            // Check if the user wants to stop entering numbers
            if ("stop".equalsIgnoreCase(input)) {
                break;
            }
            
            // Parse the input into an integer
            int number = Integer.parseInt(input);
            
            // Update smallest and largest numbers
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
            
            // Update sum and count
            sum += number;
            count++;
        }
        
        // Check to avoid division by zero when calculating the average
        if (count == 0) {
            System.out.println("No numbers were entered.");
        } else {
            double average = sum / count;
            System.out.println("Smallest Number: " + smallest);
            System.out.println("Largest Number: " + largest);
            System.out.printf("Average: %.2f\n", average);
        }
    }
}
