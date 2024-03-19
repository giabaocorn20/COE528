package coe528.lab2;

import java.util.Arrays;

/**
 *
 * @author giaba
 */
public class Ex3 {
    // Requires: The 2 input strings must not be null.The comparison is case-insensitive, and spaces are ignored.
    // Modifies: Nothing
    // Effects: Returns true if the input strings are anagrams, false otherwise.
    public static boolean areAnagrams(String a, String b) {
        a = a.replaceAll("\\s", "").toLowerCase();
        b = b.replaceAll("\\s", "").toLowerCase();

        if (a.length() != b.length()) {
            return false;
        }

        char[] chars_a = a.toCharArray();
        char[] chars_b = b.toCharArray();

        Arrays.sort(chars_a);
        Arrays.sort(chars_b);

        System.out.println(chars_a);
        System.out.println(chars_b);

        return Arrays.equals(chars_a, chars_b );
    }

    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];

        boolean result = areAnagrams(str1, str2);

        System.out.println(result);
    }
}
