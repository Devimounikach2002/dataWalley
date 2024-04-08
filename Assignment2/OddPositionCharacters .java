public class OddPositionCharacters {
    public static void main(String[] args) {
        String text = "type here to search";
        // Removing all whitespace from the string
        String noSpaces = text.replaceAll("\\s", "");

        System.out.println("Characters at odd positions (ignoring whitespace):");
        
        // Iterate over the characters of the string without spaces
        for(int i = 0; i < noSpaces.length(); i++) {
            // Check if the position is odd (i is even because array indexes start at 0)
            if(i % 2 == 0) {
                // Print the character at the odd position
                System.out.print(noSpaces.charAt(i) + " ");
            }
        }
    }
}
