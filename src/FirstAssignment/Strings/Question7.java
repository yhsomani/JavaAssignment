package FirstAssignment.Strings;

/**
 * Comparing strings using the methods equals(),
 */
public class Question7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        String str3 = "Hello";

        System.out.println("Comparing str1 and str2 using equals(): " + str1.equals(str2));
        System.out.println("Comparing str1 and str3 using equals(): " + str1.equals(str3));
    }
}
