import java.util.Scanner;

public class JAVA_C_pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String input = scanner.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Convert the input string to lowercase to handle both cases
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is an uppercase letter
            if (ch >= 'A' && ch <= 'Z') {
                // Convert it to lowercase by adding the ASCII difference (32)
                ch = (char) (ch + 32);
            }
            
            sb.append(ch);
        }
        
        String s2 = sb.toString();
        
        // Create a boolean array to track the occurrence of each alphabet letter
        boolean[] letters = new boolean[26]; // 26 letters from 'a' to 'z'
        
        // Iterate through the input string and mark encountered letters
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                letters[ch - 'a'] = true;
            }
        }
        
        // Check if all letters have been encountered
        for (boolean letter : letters) {
            if (!letter) {
                return false; // If any letter is missing, it's not a pangram
            }
        }
        
        return true; // All letters are present, it's a pangram
    }
}