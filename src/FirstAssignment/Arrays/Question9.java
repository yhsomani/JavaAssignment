package FirstAssignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function to reverse an array of integer values
 */
public class Question9 {
    public static int[] reverseArray(int[] arr) {
        // Create a new array with the same size as the original array
        int[] result = new int[arr.length];
        // Loop through the original array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {
            // Copy each element to the new array in reverse order
            result[arr.length - i - 1] = arr[i];
        }
        // Return the new array
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter Array Element Array[%d]: ", i + 1);
            myArray[i] = sc.nextInt();
        }
        int[] contains = reverseArray(myArray);
        System.out.println("Given Array: "+Arrays.toString(myArray));
        System.out.println("Reversed Array: "+Arrays.toString(contains));
    }
}
