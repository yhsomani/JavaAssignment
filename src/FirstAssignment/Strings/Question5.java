package FirstAssignment.Strings;

/**
 * Searching in strings using indexOf()
 */
public class Question5 {
    public static void main(String[] args) {
        String text = "The quick brown fox jumps over the lazy dog";
        String searchTerm = "fox";

        int index = text.indexOf(searchTerm);

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}
