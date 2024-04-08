public class SumOfDivisibleNumbers {
    public static void main(String[] args) {
        // Given array
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0; // Initialize sum of divisible numbers

        // Iterate over each element in the array
        for(int value : values) {
            // Check if the number is divisible by both 5 and 2
            if(value % 10 == 0) {
                sum += value; // Add to sum if condition is met
            }
        }

        // Display the result
        System.out.println("Sum of numbers divisible by 5 and 2: " + sum);
    }
}
