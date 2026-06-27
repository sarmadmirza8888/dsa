/*
 * ------------------------------------------------------------
 * Problem    : 242. Valid Anagram
 * File       : ValidAnagramBrute.java
 * Approach   : Brute Force (Sorting)
 *
 * Description:
 * Convert both strings into character arrays, sort them,
 * and compare the sorted arrays. If they are identical,
 * the strings are anagrams.
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

import java.util.Arrays;
class ValidAnagramBrute {
    public boolean isAnagram(String s, String t) {
        // If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        // Convert strings to character arrays
        char[] first = s.toCharArray();
        char[] second = t.toCharArray();
        // Sort both arrays
        Arrays.sort(first);
        Arrays.sort(second);
        // Compare the sorted arrays
        return Arrays.equals(first, second);
    }
    public static void main(String[] args) {
        ValidAnagramBrute solution = new ValidAnagramBrute();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
    }
}