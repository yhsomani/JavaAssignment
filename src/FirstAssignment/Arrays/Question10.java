package FirstAssignment.Arrays;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * Write a function to find the duplicate values of an array
 */
public class Question10 {
    public static void findDuplicates(int[] arr) {
        // Create a hash set to store unique values
        Set<Integer> set = new HashSet<>();
        // Create a hash set to store duplicate values
        Set<Integer> duplicates = new HashSet<>();
        // Loop through the array
        for (int j : arr) {
            // If the current value is already in the set, it's a duplicate
            if (set.contains(j)) {
                duplicates.add(j);
            } else {
                set.add(j);
            }
        }
        // Print the duplicate values
        System.out.println("Duplicate values:");
        for (int value : duplicates) {
            System.out.println(value);
        }
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
        findDuplicates(myArray);
}}
