package FirstAssignment.Arrays;

import java.util.Arrays;

/**
 * Write a program to remove the duplicate elements and return the new array
 */
public class Question18 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4, 5, 4, 6};
        int[] newArr = removeDuplicates(arr);
        System.out.println("Original array: " + Arrays.toString(arr));
        System.out.println("New array with duplicates removed: " + Arrays.toString(newArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        // Create a new array to store unique elements
        int[] newArr = new int[arr.length];
        int count = 0;

        // Loop through each element in the array
        for (int i = 0; i < arr.length; i++) {
            boolean isDuplicate = false;

            // Check if the element is already in the new array
            for (int j = 0; j < count; j++) {
                if (arr[i] == newArr[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // If the element is not a duplicate, add it to the new array
            if (!isDuplicate) {
                newArr[count] = arr[i];
                count++;
            }
        }

        // Trim the new array to remove unused elements
        return Arrays.copyOf(newArr, count);
    }
}