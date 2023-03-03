package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a function to get the difference of largest and smallest value
 */
public class Question16 {
    public static int getDifference(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest - smallest;
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
        getDifference(myArray);
    }
}
