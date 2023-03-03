package FirstAssignment.Arrays;

import java.util.Scanner;
import java.util.*;

/**
 * Write a method to remove duplicate elements from an array
 */
public class Question12 {
    public static int[] removeDuplicates(int[] arr) {
        // Create a hash set to store unique values
        Set<Integer> set = new HashSet<>();
        // Create a list to store the unique values in order
        List<Integer> list = new ArrayList<>();
        // Loop through the array
        for (int value : arr) {
            // If the current value is not in the set, it's unique
            if (!set.contains(value)) {
                set.add(value);
                list.add(value);
            }
        }
        // Convert the list to an array and return it
        return list.stream().mapToInt(Integer::intValue).toArray();
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
        System.out.println(Arrays.toString(removeDuplicates(myArray)));
    }
}
