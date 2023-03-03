package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Write a program to print the odd and even numbers
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number;
        while (true){
            System.out.print("Enter Number: ");
            number = sc.nextInt();
            if (number%2==0){
                System.out.println(number+" Number Is Even");
            }else {
                System.out.println(number+" Number Is Odd");
            }
        }
    }
}
