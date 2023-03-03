package FirstAssignment.Strings;

/**
 * Splitting strings with split()
 */
public class Question11 {
    public static void main(String[] args) {
        String inputString = "apple,banana,orange,grape";

        // Split the string into an array of substrings using the delimiter ","
        String[] fruitsArray = inputString.split(",");

        // Print each substring in the array
        for (String fruit : fruitsArray) {
            System.out.println(fruit);
        }
    }
}
