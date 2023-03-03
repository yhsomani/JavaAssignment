package FirstAssignment.Strings;

/**
 * Print instance variables in static methods
 */
public class Question2 {
    int num1 = 10;
    String str = "Hello";
    static int num2 = 20;
    static String msg = "World";

    public static void print() {
        // Create an object of MyClass
        Question2 obj = new Question2();
        // Access the instance variables using the object
        System.out.println(obj.num1);
        System.out.println(obj.str);
        // Access the static variables directly
        System.out.println(num2);
        System.out.println(msg);
    }

    public void display() {
        // Access the instance variables directly
        System.out.println(num1);
        System.out.println(str);
        // Access the static variables directly
        System.out.println(num2);
        System.out.println(msg);
    }

    public static void main(String[] args) {
        print();
        Question2 obj = new Question2();
        obj.display();
    }
}
