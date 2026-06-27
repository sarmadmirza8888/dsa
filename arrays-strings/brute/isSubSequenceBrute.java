/*
 * ------------------------------------------------------------
 * Problem    : 392. Is Subsequence
 * File       : isSubsequenceBrute.java
 * Approach   : Brute Force (Nested Loops)
 *
 * Description:
 * For each character in string 's', search sequentially in
 * string 't' starting from the last matched position.
 * If every character in 's' is found in order, then 's'
 * is a subsequence of 't'.
 *
 * Time Complexity  : O(n × m)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */
public class isSubSequenceBrute {
    public static boolean isSubsequence(String s, String t) {
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean found = false;
            for (int j = start; j < t.length(); j++) {
                if (s.charAt(i) == t.charAt(j)) {
                    start = j + 1;
                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "abc";
        String t = "ahbgdc";

        if (isSubsequence(s, t))
            System.out.println("true");
        else {
            System.out.println("false");
        }
    }
}