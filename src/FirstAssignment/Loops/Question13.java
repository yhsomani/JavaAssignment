package FirstAssignment.Loops;

import java.util.Scanner;

/**
 * Program for a multiple if else statement (the Largest number in 10,20 and 30)
 */
public class Question13 {
    public static void main(String[] args) {
        int num1=10,num2=20,num3=30;
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
