package FirstAssignment.Operator;

import java.util.Scanner;

/**
 * Programs on Logical AND, OR operator and Logical NOT
 */
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();
//        check both are even and positive
        if (num1%2==0 && num2%2==0){
            if (num1>=0 && num2>=0){
                System.out.println("Both Number are Even and Positive");
            }
        }
//        Check both are odd and negative
        else if (num1%2!=0 && num2%2!=0){
            if (num1<0 && num2<0){
                System.out.println("Both Number are Odd and Negative");
            }
        }
//        both are nigther negative, positive, even and odd
        else {
            if (num1<0 || num2<0){
                System.out.println("Not Negative, Positive, Odd and Even");
            }
        }
    }
}
