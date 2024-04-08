import java.util.Scanner;

public class VowelsAndConsonantsCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine().toLowerCase(); // Convert to lowercase to simplify checks
        
        int vowelsCount = 0;
        int consonantsCount = 0;
        
        
        for(int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);
            
            
            if(Character.isLetter(currentChar)) {
                // Check if the character is a vowel
                if(currentChar == 'a' || currentChar == 'e' || currentChar == 'i' || currentChar == 'o' || currentChar == 'u') {
                    vowelsCount++;
                } else {
                    
                    consonantsCount++;
                }
            }
        }
        
        System.out.println("Number of vowels: " + vowelsCount);
        System.out.println("Number of consonants: " + consonantsCount);
    }
}
