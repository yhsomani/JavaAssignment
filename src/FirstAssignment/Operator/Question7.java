package FirstAssignment.Operator;

import java.util.Scanner;

/**
 * Print the smaller and larger number
 */
public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Number 2: ");
        int num2 = sc.nextInt();
        if (num1>num2){
            System.out.println(num1+" Is Greater Than "+num2);
        } else if (num1<num2) {
            System.out.println(num1+" Is Smaller Than "+num2);
        }else {
            System.out.println(num1+" Are Equal "+num2);
        }
    }
}
