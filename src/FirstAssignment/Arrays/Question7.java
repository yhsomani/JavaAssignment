package FirstAssignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function to insert an element at a specific position in the array
 */
public class Question7 {
    public static int[] insertElementInArray(int[] arr, int element, int index) {
        // Create a new array with a size one greater than the original array
        int[] result = new int[arr.length + 1];
        // Loop through the original array up to the insert position
        for (int i = 0; i < index; i++) {
            // Copy each element to the new array
            result[i] = arr[i];
        }
        // Insert the new element at the insert position
        result[index] = element;
        // Loop through the original array from the insert position to the end
        for (int i = index; i < arr.length; i++) {
            // Copy each element to the new array
            result[i+1] = arr[i];
        }
        // Return the new array
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int where = 0;
        int[] myArray = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter Array Element Array[%d]: ", i + 1);
            myArray[i] = sc.nextInt();
        }
        System.out.print("Enter Value to be Add: ");
        int myValue = sc.nextInt();
        System.out.print("Enter the Position net to you want to add value: ");
        where = sc.nextInt();
        int[] contains = insertElementInArray(myArray, myValue, where);
        System.out.println(Arrays.toString(contains));
    }
}
