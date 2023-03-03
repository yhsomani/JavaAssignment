package FirstAssignment.Strings;

/**
 * Extract a string using Substring
 */
public class Question4 {
    public static void main(String[] args) {
        String originalString = "Hello, world!";
        int startIndex = 7; // index where the substring starts
        int endIndex = 12; // index where the substring ends (exclusive)

        // Extract the substring using substring() method
        String extractedString = originalString.substring(startIndex, endIndex);

        // Print the original string and the extracted substring
        System.out.println("Original string: " + originalString);
        System.out.println("Extracted substring: " + extractedString);
    }
}
