package FirstAssignment.Strings;

/**
 * Replacing characters in strings with replace()
 */
public class Question10 {
    public static void main(String[] args) {
        // Create a string to work with
        String originalString = "Hello World!";

        // Replace 'o' with 'x'
        String newString = originalString.replace('o', 'x');

        // Output the new string
        System.out.println("Original String: " + originalString);
        System.out.println("New String: " + newString);
    }
}
