package FirstAssignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function to find the minimum and maximum value of an array
 */
public class Question8 {
    public static void findMinMax(int[] arr) {
        int min = arr[0]; // Initialize min to the first element of the array
        int max = arr[0]; // Initialize max to the first element of the array
        // Loop through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            // If the current element is less than the current min, update min
            if (arr[i] < min) {
                min = arr[i];
            }
            // If the current element is greater than the current max, update max
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        // Print the min and max values
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
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
        findMinMax(myArray);
    }
}
