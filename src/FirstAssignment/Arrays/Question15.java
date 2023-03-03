package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a method to find a number of even numbers and odd numbers in an array
 */
public class Question15 {
    public static void countEvenOdd(int[] arr) {
        int evenCount = 0;
        int oddCount = 0;
        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
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
        countEvenOdd(myArray);
    }
}
