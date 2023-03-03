package FirstAssignment.Static;

/**
 * Call static methods in instance methods
 */
public class Question5 {
    // static variables
    static int num1 = 5;
    static int num2 = 10;

    // instance variables
    int value1;
    int value2;

    // static methods
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    // instance methods
    public int multiplyValues() {
        return multiply(value1, value2); // calling static method within instance method
    }

    public int addValues() {
        return add(value1, value2); // calling static method within instance method
    }

    // main method
    public static void main(String[] args) {
        Question5 example = new Question5(); // creating an object of Example class
        example.value1 = 2;
        example.value2 = 3;
        System.out.println("Multiplication of values: " + example.multiplyValues());
        System.out.println("Addition of values: " + example.addValues());
    }
}
