package FirstAssignment.Strings;

/**
 * equalsIgnoreCase(), startsWith(), endsWith() and compareTo()
 */
public class Question8 {public static void main(String[] args) {

    String str1 = "Hello World";
    String str2 = "hello world";
    String str3 = "Hello Java";

    // Demonstrate equalsIgnoreCase() method
    boolean equalsIgnoreCaseResult = str1.equalsIgnoreCase(str2);
    System.out.println("equalsIgnoreCase() result: " + equalsIgnoreCaseResult);

    // Demonstrate startsWith() method
    boolean startsWithResult = str1.startsWith("Hello");
    System.out.println("startsWith() result: " + startsWithResult);

    // Demonstrate endsWith() method
    boolean endsWithResult = str1.endsWith("World");
    System.out.println("endsWith() result: " + endsWithResult);

    // Demonstrate compareTo() method
    int compareToResult = str1.compareTo(str3);
    System.out.println("compareTo() result: " + compareToResult);
}

}
