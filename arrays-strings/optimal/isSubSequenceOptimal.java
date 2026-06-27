/*
 * ------------------------------------------------------------
 * Problem    : 392. Is Subsequence
 * File       : isSubsequenceOptimal.java
 * Approach   : Optimal (Two Pointers)
 *
 * Description:
 * Use two pointers to traverse both strings simultaneously.
 * Advance both pointers when characters match; otherwise,
 * advance only the pointer of string 't'. If all characters
 * of 's' are matched, then 's' is a subsequence of 't'.
 *
 * Time Complexity  : O(n + m)
 * Space Complexity : O(1)
 *
 * ------------------------------------------------------------
 */
public class isSubSequenceOptimal {
    public static boolean isSubsequence(String s, String t) {
        int i = 0;
        int j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        return i == s.length();
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        if (isSubsequence(s, t))
            System.out.println("True");
        else
            System.out.println("False");
    }
}