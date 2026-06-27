/*
 * ------------------------------------------------------------
 * Problem    : 344. Reverse String
 * File       : ReverseStringBrute.java
 * Approach   : Brute Force (Extra Array)
 *
 * Description:
 * Create a temporary array and copy the characters from the
 * original array in reverse order. Then copy the reversed
 * characters back into the original array.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
class ReverseStringBrute {
    public void reverseString(char[] s) {
        // Create a temporary array
        char[] reversed = new char[s.length];
        // Fill the temporary array in reverse order
        for (int i = 0; i < s.length; i++) {
            reversed[i] = s[s.length - 1 - i];
        }
        // Copy back into the original array
        for (int i = 0; i < s.length; i++) {
            s[i] = reversed[i];
        }
    }
    public static void main(String[] args) {
        ReverseStringBrute solution = new ReverseStringBrute();
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};
        solution.reverseString(s1);
        solution.reverseString(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    }
}