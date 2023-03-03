package FirstAssignment.Operator;

import java.util.Scanner;

/**
 * Write a program to find the two numbers equal or not
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter X value: ");
        int x = sc.nextInt();
        System.out.print("Enter Y value: ");
        int y = sc.nextInt();
        if (x==y){
            System.out.println("Number Are Equal");
        }else {
            System.out.println("Number are Not Equal");
        }
    }
}
