package FirstAssignment.Arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * Write a program to find the common values between two arrays
 */
public class Question11 {
        public static void main(String[] args) {
            int[] arr1 = {1, 2, 3, 4, 5};
            int[] arr2 = {3, 4, 5, 6, 7};
            // Create two hash sets to store values
            Set<Integer> set1 = new HashSet<>();
            Set<Integer> set2 = new HashSet<>();
            // Add values from the first array to the first set
            for (int value : arr1) {
                set1.add(value);
            }
            // Add values from the second array to the second set
            for (int value : arr2) {
                set2.add(value);
            }
            // Find the common values
            set1.retainAll(set2);
            // Print the common values
            System.out.println("Common values:");
            for (int value : set1) {
                System.out.println(value);
            }
        }
    }