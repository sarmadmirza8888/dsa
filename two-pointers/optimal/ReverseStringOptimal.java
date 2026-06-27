/*
 * ------------------------------------------------------------
 * Problem    : 344. Reverse String
 * File       : ReverseStringOptimal.java
 * Approach   : Optimal (Two Pointers)
 *
 * Description:
 * Use two pointers, one at the beginning and one at the end
 * of the array. Swap the characters at both pointers and
 * move them towards each other until they meet.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
class ReverseStringOptimal {
    public void reverseString(char[] s) {
        // Pointer at the beginning
        int left = 0;
        // Pointer at the end
        int right = s.length - 1;
        // Continue until the pointers meet
        while (left < right) {
            // Swap the characters
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            // Move both pointers
            left++;
            right--;
        }
    }
    public static void main(String[] args) {
        ReverseStringOptimal solution = new ReverseStringOptimal();
        char[] s1 = {'h','e','l','l','o'};
        char[] s2 = {'H','a','n','n','a','h'};
        solution.reverseString(s1);
        solution.reverseString(s2);
        System.out.println(Arrays.toString(s1));
        System.out.println(Arrays.toString(s2));
    }
}