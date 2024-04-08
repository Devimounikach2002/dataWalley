import java.util.Scanner;

public class ReplaceCharAtIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
      
        System.out.print("Enter the original string: ");
        String originalString = scanner.nextLine();
        
        
        System.out.print("Enter the index at which to replace the character: ");
        int index = scanner.nextInt();
        scanner.nextLine(); 
        
        
        System.out.print("Enter the new character: ");
        String newChar = scanner.nextLine();
        
        
        if(index < 0 || index >= originalString.length()) {
            System.out.println("Index is out of bounds.");
        } else {
            
            String modifiedString = originalString.substring(0, index) + newChar + originalString.substring(index + 1);
            
           
            System.out.println("Modified string: " + modifiedString);
        }
    }
}
