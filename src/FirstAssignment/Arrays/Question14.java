package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a method to find the second largest number in an array
 */
public class Question14 {
    public static int findSecondLargest(int[] arr) {
        // Initialize the largest and second largest variables
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        // Loop through the array
        for (int value : arr) {
            // If the current value is greater than the largest, update the largest and second largest
            if (value > largest) {
                secondLargest = largest;
                largest = value;
            }
            // If the current value is greater than the second largest but not the largest, update the second largest
            else if (value > secondLargest && value != largest) {
                secondLargest = value;
            }
        }
        // Return the second largest
        return secondLargest;
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
        findSecondLargest(myArray);
    }
}
