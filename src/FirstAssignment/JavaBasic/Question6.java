package FirstAssignment.JavaBasic;

/**
 *  Write a function to print your name and call the function from the main method
 */
public class Question6 {
    public void callMyName(){
        System.out.println("Yash Somani");
    }
    public static void main(String[] args) {
        Question6 obj = new Question6();
        obj.callMyName();
    }
}
