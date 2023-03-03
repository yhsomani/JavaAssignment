package FirstAssignment.Loops;

/**
 * Write a program to print even number between 10 and 100 using while
 */
public class Question6 {
    public static void main(String[] args) {
        for (int i = 10; i <= 100; i++) {
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}
