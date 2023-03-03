package FirstAssignment.Strings;

/**
 * Call instance methods in static methods
 */
public class Question4 {
    int x = 10; //instance variable
    static int y = 20; //static variable

    public void instanceMethod() {
        System.out.println("Inside instance method");
    }

    public static void staticMethod() {
        System.out.println("Inside static method");
        Question4 obj = new Question4();
        obj.instanceMethod(); //calling instance method using an object
    }

    public static void main(String[] args) {
        staticMethod(); //calling static method
    }
}
