package FirstAssignment.Strings;

/**
 * Trimming strings with trim()
 */
public class Question9 {
    public static void main(String[] args) {
        String input = "   Hello, World!   ";
        String trimmed = input.trim();
        System.out.println("Original String: \"" + input + "\"");
        System.out.println("Trimmed String: \"" + trimmed + "\"");
    }
}
