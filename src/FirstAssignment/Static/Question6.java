package FirstAssignment.Static;

/**
 * Print all the static, instance variables in the main method
 */
public class Question6 {
    // Static variables
    static int staticVar1 = 10;
    static String staticVar2 = "Hello";

    // Instance variables
    int instanceVar1 = 20;
    String instanceVar2 = "World";

    // Static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2");
    }

    // Instance methods
    public void instanceMethod1() {
        System.out.println("This is instance method 1");
    }

    public void instanceMethod2() {
        System.out.println("This is instance method 2");
    }

    public static void main(String[] args) {
        // Print static variables
        System.out.println("Static variables:");
        System.out.println("Static variable 1: " + staticVar1);
        System.out.println("Static variable 2: " + staticVar2);

        // Create an object of ExampleClass to access instance variables
        Question6 exampleObject = new Question6();

        // Print instance variables
        System.out.println("Instance variables:");
        System.out.println("Instance variable 1: " + exampleObject.instanceVar1);
        System.out.println("Instance variable 2: " + exampleObject.instanceVar2);
    }
}
