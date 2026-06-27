/*
 * ------------------------------------------------------------
 * Problem    : 392. Is Subsequence
 * File       : isSubsequenceOptimal.java
 * Approach   : Optimal (Two Pointers)
 *
 * Description:
 * Use two pointers to traverse both strings simultaneously.
 * If the characters match, move both pointers forward.
 * Otherwise, move only the pointer of string 't'.
 * If all characters of string 's' are matched before
 * reaching the end of 't', then 's' is a subsequence of 't'.
 *
 * Time Complexity  : O(n + m)
 * Space Complexity : O(1)
 *
 * ------------------------------------------------------------
 */
class isSubSequenceOptimal {
    public boolean isSubsequence(String s, String t) {

        // Pointer for string 's'
        int i = 0;

        // Pointer for string 't'
        int j = 0;

        // Traverse both strings
        while (i < s.length() && j < t.length()) {

            // If characters match, move both pointers
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            }
            // Otherwise, move only the pointer of string 't'
            else {
                j++;
            }
        }
        // If all characters of 's' have been matched,
        // then 's' is a subsequence of 't'.
        return i == s.length();
    }
    public static void main(String[] args) {
        isSubSequenceOptimal solution = new isSubSequenceOptimal();
        String s1 = "abc";
        String t1 = "ahbgdc";
        System.out.println("Input : s = \"abc\", t = \"ahbgdc\"");
        System.out.println("Output: " + solution.isSubsequence(s1, t1));
        System.out.println();
    }
}