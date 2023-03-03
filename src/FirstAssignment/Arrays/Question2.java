package FirstAssignment.Arrays;

import java.util.Scanner;

/**
     * Write a function to calculate the average value of an array of integers
 */
public class Question2 {
    public static double calculateAverage(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        return average;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Array Values: ");
        for (int i = 0; i < size ; i++) {
            System.out.print(String.format("Enter the vale of Array[%d]: ",i+1));
            arr[i]= sc.nextInt();
        }
        double sum = calculateAverage(arr);
        System.out.println("Sum: " + sum);
    }
}