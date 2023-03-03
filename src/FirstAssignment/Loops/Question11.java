package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Program to check whether a number is EVEN or ODD using switch
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        switch (num % 2) {
            case 0 -> System.out.println(num + " is an even number.");
            case 1 -> System.out.println(num + " is an odd number.");
            default -> System.out.println("Invalid input!");
        }
    }
}
