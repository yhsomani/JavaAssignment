package FirstAssignment.Static;

/**
 * Call static methods and instance methods in the main method
 */
public class Question7 {
    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1.");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2.");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("This is instance method 1.");
    }

    public void instanceMethod2() {
        System.out.println("This is instance method 2.");
    }

    // Main method
    public static void main(String[] args) {
        // Call static methods
        staticMethod1();
        staticMethod2();

        // Create an instance of ExampleClass
        Question7 obj = new Question7();

        // Call instance methods using the object
        obj.instanceMethod1();
        obj.instanceMethod2();

        // Access static variables
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        // Access instance variables using the object
        System.out.println("Instance variable 1: " + obj.instanceVar1);
        System.out.println("Instance variable 2: " + obj.instanceVar2);
    }
}
