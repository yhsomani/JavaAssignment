package FirstAssignment.Strings;

/**
 * Different ways creating a string
 */
public class Question1 {
    public static void main(String[] args) {
        // Using string literal
        String str1 = "Hello, world!";
        System.out.println("Using string literal: " + str1);

        // Using new keyword to create a string object
        String str2 = new String("Hello, world!");
        System.out.println("Using new keyword: " + str2);

        // Using a char array to create string
        char[] charArray = { 'H', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd', '!' };
        String str3 = new String(charArray);
        System.out.println("Using char array: " + str3);

        // Using StringBuffer
        StringBuffer sb = new StringBuffer("Hello, ");
        sb.append("world!");
        String str4 = sb.toString();
        System.out.println("Using StringBuffer: " + str4);

        // Using StringBuilder
        StringBuilder sb2 = new StringBuilder("Hello, ");
        sb2.append("world!");
        String str5 = sb2.toString();
        System.out.println("Using StringBuilder: " + str5);
    }
}
