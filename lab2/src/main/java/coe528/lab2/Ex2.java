package coe528.lab2;

/**
 *
 * @author giaba
 */
public class Ex2 {
    // Requires:  The input string must not be null.
    // Modifies: None
    // Effects: Returns true if the input string is a palindrome, false otherwise.
    public static boolean isPalindrome(String a) {

        String reversed = "";
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed += a.charAt(i); //String concatenation  - use StringBuilder instead
        }
        System.out.println("Original: " + a);
        System.out.println("Reversed: " + reversed);
        return a.equals(reversed);
    }

    public static void main(String[] args) {
        if (args.length == 1) {
            if (args[0].equals("1"))
                System.out.println(isPalindrome(null));
            else if (args[0].equals("2"))
                System.out.println(isPalindrome(""));
            else if (args[0].equals("3"))
                System.out.println(isPalindrome("deed"));
            else if (args[0].equals("4"))
                System.out.println(isPalindrome("abcd"));
        }
    }
}