package FirstAssignment.Strings;

/**
 * Write a class with 2 static variables, 2 Instance variables, 2 static methods, 2 instance methods and a main method.
 */
public class Question1 {
    // static variables
    public static int staticVar1 = 1;
    public static int staticVar2 = 2;

    // instance variables
    private final int instanceVar1;
    private final int instanceVar2;

    // constructors
    public Question1(int instanceVar1, int instanceVar2) {
        this.instanceVar1 = instanceVar1;
        this.instanceVar2 = instanceVar2;
    }

    // static methods
    public static void staticMethod1() {
        System.out.println("Static method 1 called.");
    }

    public static void staticMethod2() {
        System.out.println("Static method 2 called.");
    }

    // instance methods
    public void instanceMethod1() {
        System.out.println("Instance method 1 called.");
    }

    public void instanceMethod2() {
        System.out.println("Instance method 2 called.");
    }

    // main method
    public static void main(String[] args) {
        // accessing static variables
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        // calling static methods
        staticMethod1();
        staticMethod2();

        // creating instance of Question1
        Question1 myObj = new Question1(3, 4);

        // accessing instance variables
        System.out.println("Instance variable 1: " + myObj.instanceVar1);
        System.out.println("Instance variable 2: " + myObj.instanceVar2);

        // calling instance methods
        myObj.instanceMethod1();
        myObj.instanceMethod2();
    }
}
