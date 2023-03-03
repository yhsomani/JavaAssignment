package FirstAssignment.JavaBasic;


/**
 * Define variables for different Data Types int, Boolean, char, float, double and print on the Console
*/
public class Question4 {
    public static void main(String[] args) {
        int integer = 0;
        boolean flag = true;
        char character = 'c';
        float flotNumber = 12.3F;
        double doubleNumber = 12.3;
        System.out.println("integer = "+((Object)integer).getClass().getSimpleName());
        System.out.println("flag = "+((Object)flag).getClass().getSimpleName());
        System.out.println("character = "+((Object)character).getClass().getSimpleName());
        System.out.println("flotNumber = "+((Object)flotNumber).getClass().getSimpleName());
        System.out.println("doubleNumber = "+((Object)doubleNumber).getClass().getSimpleName());

    }
}
