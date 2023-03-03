package FirstAssignment.Operator;

/**
 * Write a function for arithmetic operators(+,-,*,/)
 */
public class Question1 {
    public static double arithmatic_operators(double num1, double num2, char operator){
        double result =0;
        switch (operator){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '*':
                result = num1*num2;
                break;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Addition is: "+arithmatic_operators(2,3,'+'));
        System.out.println("Subtraction is: "+arithmatic_operators(2,3,'-'));
        System.out.println("Division is: "+arithmatic_operators(2,3,'/'));
        System.out.println("Multiplication is: "+arithmatic_operators(2,3,'*'));
    }
}
