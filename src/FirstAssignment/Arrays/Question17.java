package FirstAssignment.Arrays;

import java.util.Scanner;

/**
 * Write a method to verify if the array contains two specified elements(12,23)
 */
public class Question17 {
        public static boolean containsElements(int[] arr, int elem1, int elem2) {
            boolean foundElem1 = false;
            boolean foundElem2 = false;

            for(int i=0; i<arr.length; i++) {
                if(arr[i] == elem1) {
                    foundElem1 = true;
                }
                if(arr[i] == elem2) {
                    foundElem2 = true;
                }
            }

            if(foundElem1 && foundElem2) {
                return true;
            } else {
                return false;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < size; i++) {
                System.out.printf("Enter Array Element Array[%d]: ", i + 1);
                arr[i] = sc.nextInt();
            }
            int elem1 = sc.nextInt();
            int elem2 = sc.nextInt();

            boolean containsBoth = containsElements(arr, elem1, elem2);

            if(containsBoth) {
                System.out.println("Array contains both " + elem1 + " and " + elem2);
            } else {
                System.out.println("Array does not contain both " + elem1 + " and " + elem2);
            }
        }
    }
