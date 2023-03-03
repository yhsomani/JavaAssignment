package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Print gender (Male/Female) program according to given M/F using switch
 */
public class Question12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);
        switch(gender) {
            case 'M':
            case 'm':
                System.out.println("Male");
                break;
            case 'F':
            case 'f':
                System.out.println("Female");
                break;
            default:
                System.out.println("Invalid input!");
                break;
        }
    }
}
