package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Write a program to print the largest number among three numbers
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3;
        System.out.print("Enter First Number: ");
        num1 = sc.nextInt();
        System.out.print("Enter Second Number: ");
        num2 = sc.nextInt();
        System.out.print("Enter Third Number: ");
        num3 = sc.nextInt();
        if (num1<num2){
            if (num2<num3){
                System.out.println(num3+" Is Largest");
            }
            else {
                System.out.println(num2+" Is Largest");
            }
        } else if (num1<num3) {
            System.out.println(num3+" Is Largest");
        }else {
            System.out.println(num1+" Is Largest");

        }
    }
}
