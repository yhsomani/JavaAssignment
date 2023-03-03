package FirstAssignment.Strings;

import java.util.Scanner;

/**
 * Converting to uppercase and lowercase
 */
public class Question14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Convert the string to uppercase and print it
        String upperCase = input.toUpperCase();
        System.out.println("Uppercase: " + upperCase);

        // Convert the string to lowercase and print it
        String lowerCase = input.toLowerCase();
        System.out.println("Lowercase: " + lowerCase);

        scanner.close();
    }
}
