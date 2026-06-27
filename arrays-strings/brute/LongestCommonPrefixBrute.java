/*
 * ------------------------------------------------------------
 * Problem    : 14. Longest Common Prefix
 * File       : LongestCommonPrefixBrute.java
 * Approach   : Brute Force (Character-by-Character Comparison)
 *
 * Description:
 * Compare characters of all strings one position at a time.
 * Continue until a mismatch is found or the shortest string
 * ends. The matched characters form the longest common prefix.
 *
 * Time Complexity  : O(n × m)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class LongestCommonPrefixBrute {
    public String longestCommonPrefix(String[] strs) {
        // Handle empty input
        if (strs == null || strs.length == 0)
            return "";
        String firstString = strs[0];
        // Compare each character of the first string
        for (int i = 0; i < firstString.length(); i++) {
            char currentCharacter = firstString.charAt(i);
            // Compare with every other string
            for (int j = 1; j < strs.length; j++) {

                // Character mismatch or string ended
                if (i >= strs[j].length() ||
                        strs[j].charAt(i) != currentCharacter) {

                    return firstString.substring(0, i);
                }
            }
        }
        return firstString;
    }
    public static void main(String[] args) {
        LongestCommonPrefixBrute solution = new LongestCommonPrefixBrute();
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println(solution.longestCommonPrefix(strs1));
        System.out.println(solution.longestCommonPrefix(strs2));
    }
}