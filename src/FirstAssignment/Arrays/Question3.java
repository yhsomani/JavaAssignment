package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a program to find the index of an array element
 */
public class Question3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array of integers
        int[] arr = { 5, 10, 15, 20, 25 };
        System.out.print("Enter the target element: ");
        int target = input.nextInt();

        // Find the index of the target element
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }

        // Print the index of the target element
        if (index == -1) {
            System.out.println("Element not found in the array");
        } else {
            System.out.println("Index of the target element: " + index);
        }
    }
}
