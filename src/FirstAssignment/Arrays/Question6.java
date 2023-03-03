package FirstAssignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function to copy an array to another array
 */
public class Question6 {
    public static int[] copyArray(int[] arr) {
        // Create a new array with the same size as the original array
        int[] result = new int[arr.length];
        // Loop through the original array
        for (int i = 0; i < arr.length; i++) {
            // Copy each element to the new array
            result[i] = arr[i];
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
        int[] contains = copyArray(myArray);
        System.out.println("Given Array: "+ Arrays.toString(myArray));
        System.out.println("Coped Array: "+Arrays.toString(contains));
    }
}
