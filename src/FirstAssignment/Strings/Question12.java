package FirstAssignment.Strings;

/**
 * Converting Numbers to Strings with valueOf()
 */
public class Question12 {
    public static void main(String[] args) {
        int number = 1234;
        double decimal = 3.14159;

        // Converting integer to string using valueOf() method
        String numberAsString = String.valueOf(number);
        System.out.println("Number as string: " + numberAsString);

        // Converting double to string using valueOf() method
        String decimalAsString = String.valueOf(decimal);
        System.out.println("Decimal as string: " + decimalAsString);
    }
}
