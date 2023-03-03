package FirstAssignment.Operator;

/**
 * Write a method for increment and decrement operators(++, --)
 */
public class Question2 {

    private int value;

    public Question2(int value) {
        this.value = value;
    }

    public Question2 increment() {
        return new Question2(this.value + 1);
    }

    public Question2 decrement() {
        return new Question2(this.value - 1);
    }

    public int getValue() {
        return this.value;
    }

    public static void main(String[] args) {
        Question2 num1 = new Question2(5);
        Question2 num2 = new Question2(-3);

        System.out.println("Initial values: " + num1.getValue() + ", " + num2.getValue());

        Question2 result1 = num1.increment();
        Question2 result2 = num2.decrement();

        System.out.println("After increment and decrement: " + result1.getValue() + ", " + result2.getValue());
    }
}
