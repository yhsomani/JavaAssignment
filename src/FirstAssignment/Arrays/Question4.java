package FirstAssignment.Arrays;

/**
 * Write a function to test if an array contains a specific value
 */
public class Question4 {
    public static boolean containsValue(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        int myValue = 3;
        boolean contains = containsValue(myArray, myValue);
        System.out.println(contains);
    }
}
