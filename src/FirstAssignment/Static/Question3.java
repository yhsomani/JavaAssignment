package FirstAssignment.Static;

/**
 * Print static variables in Instance methods
 */
public class Question3 {
    // static variables
    public static int staticVar1 = 10;
    public static String staticVar2 = "Hello";

    // instance variables
    private int instanceVar1;
    private String instanceVar2;

    // static methods
    public static void staticMethod1() {
        System.out.println("This is static method 1");
    }

    public static void staticMethod2() {
        System.out.println("This is static method 2");
    }

    // instance methods
    public void instanceMethod1() {
        System.out.println("This is instance method 1");
        System.out.println("The value of static variable staticVar1 is: " + staticVar1);
        System.out.println("The value of static variable staticVar2 is: " + staticVar2);
    }

    public void instanceMethod2() {
        System.out.println("This is instance method 2");
        System.out.println("The value of static variable staticVar1 is: " + staticVar1);
        System.out.println("The value of static variable staticVar2 is: " + staticVar2);
    }

    // main method
    public static void main(String[] args) {
        Question3 obj = new Question3();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}
