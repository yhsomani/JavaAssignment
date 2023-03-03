package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a function to find the missing number of sorted arrays of 1 to 10
 */
public class Question19 {
    public static int findMissingNumber(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return 55 - sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[9];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            System.out.printf("Enter Array Element Array[%d]: ", i + 1);
            arr[i] = sc.nextInt();
        }
        System.out.println(findMissingNumber(arr));
    }
}
