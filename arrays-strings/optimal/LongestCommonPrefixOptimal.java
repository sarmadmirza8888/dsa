import java.util.Arrays;

/*
 * ------------------------------------------------------------
 * Problem    : 14. Longest Common Prefix
 * File       : LongestCommonPrefixOptimal.java
 * Approach   : Optimal (Sorting)
 *
 * Description:
 * Sort the array lexicographically. The longest common prefix
 * of the entire array must also be the common prefix of the
 * first and last strings after sorting.
 *
 * Time Complexity  : O(n log n + m)
 * Space Complexity : O(1)   (ignoring sorting implementation)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class LongestCommonPrefixOptimal {
    public String longestCommonPrefix(String[] strs) {
        // Handle empty input
        if (strs == null || strs.length == 0)
            return "";
        // Sort the array
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];
        int index = 0;
        // Compare first and last strings
        while (index < firstString.length()
                && index < lastString.length()
                && firstString.charAt(index) == lastString.charAt(index)) {

            index++;
        }
        return firstString.substring(0, index);
    }
    public static void main(String[] args) {
        LongestCommonPrefixOptimal solution = new LongestCommonPrefixOptimal();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs1));
        System.out.println(solution.longestCommonPrefix(strs2));
    }
}