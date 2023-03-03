package FirstAssignment.Loops;

/**
 * Program to equal operator and not equal operators
 */
public class Question3 {
    public static void main(String[] args) {
        System.out.println("Even | Odd");
        for (int i = 0; i < 20; i++) {
            if(i%2==0){
                System.out.print(i);
            }if (i%2!=0){
                System.out.println("\t\t"+i);
            }
        }
    }
}
