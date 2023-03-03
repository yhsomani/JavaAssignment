package FirstAssignment.JavaBasic;

/**
 * Define the local and Global variables with the same name and print both variables and understand the scope of the variables
 */
public class Question5 {
    String testVariable = "Global";//Global Variable
    public void testMethod(){
        String testVariable = "Local";//Local Variable
        System.out.println("Local Variable = "+ testVariable);
        System.out.println("Global Variable = "+ this.testVariable);
    }
    public static void main(String[] args) {
        Question5 obj = new Question5();
        obj.testMethod();
    }
}
