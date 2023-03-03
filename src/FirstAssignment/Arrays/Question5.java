package FirstAssignment.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Write a function to remove a specific element from an array
 */
public class Question5 {
    public static int[] removeElementFromArray(int[] arr, int elementToRemove) {
        int[] result = new int[arr.length - 1];
        int index = 0;
        // Loop through the original array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != elementToRemove) {
                result[index++] = arr[i];
            }
        }
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
        System.out.print("Enter Value to be remove: ");
        int myValue = sc.nextInt();
        int[] contains = removeElementFromArray(myArray, myValue);
        System.out.println(Arrays.toString(contains));
    }
}
