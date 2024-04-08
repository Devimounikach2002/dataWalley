import java.util.Scanner;

public class VowelCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string from the user
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Convert to lowercase to make the search case-insensitive
        inputString = inputString.toLowerCase();
        
        // Variable to hold the count of vowels
        int vowelCount = 0;
        
        // Iterate over each character to check for vowels
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }
        
        // Display the result
        if (vowelCount > 0) {
            System.out.println("Vowels are present in the string.");
            System.out.println("Total number of vowels: " + vowelCount);
        } else {
            System.out.println("No vowels are present in the string.");
        }
    }
}
