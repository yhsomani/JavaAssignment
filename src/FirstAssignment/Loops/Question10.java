package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Write a program to palindrome or not
 */
public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str, reverseStr = "";
        System.out.println("Enter The String: ");
        str = sc.nextLine();
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            reverseStr = reverseStr + str.charAt(i);
        }
        if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }
}
