package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a function to add integer values of an array
 */
public class Question1 {
    public static int addFunction(int[] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Values: ");
        for (int i = 0; i < 10 ; i++) {
            System.out.print(String.format("Enter the vale of Array[%d]: ",i+1));
            arr[i]= sc.nextInt();
        }
        int sum = addFunction(arr);
        System.out.println("Sum: " + sum);
    }
}
