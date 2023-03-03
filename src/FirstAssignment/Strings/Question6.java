package FirstAssignment.Strings;

import java.util.regex.Pattern;

/**
 * Matching a String Against a Regular Expression With matches()
 */
public class Question6 {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String regex = "Hello, \\w+!"; // regular expression to match

        // create a Pattern object using the regex
        Pattern pattern = Pattern.compile(regex);

        // use the matches() method to check if the input matches the regex
        boolean isMatch = pattern.matcher(input).matches();

        // print the result
        if (isMatch) {
            System.out.println("The input matches the regular expression!");
        } else {
            System.out.println("The input does not match the regular expression.");
        }
    }
}
