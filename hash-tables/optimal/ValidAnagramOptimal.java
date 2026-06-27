/*
 * ------------------------------------------------------------
 * Problem    : 242. Valid Anagram
 * File       : ValidAnagramOptimal.java
 * Approach   : Optimal (Hash Table / HashMap)
 *
 * Description:
 * Traverse both strings simultaneously while maintaining
 * the frequency of each character in a HashMap.
 * Increase the count for characters in the first string
 * and decrease the count for characters in the second string.
 * If all frequencies become zero, the strings are anagrams.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

import java.util.HashMap;

class ValidAnagramOptimal {

    /**
     * Returns true if the two strings are anagrams.
     */
    public boolean isAnagram(String s, String t) {

        // Different lengths cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Create a HashMap to store character frequencies
        HashMap<Character, Integer> frequency = new HashMap<>();
        // Traverse both strings together
        for (int i = 0; i < s.length(); i++) {
            char first = s.charAt(i);
            char second = t.charAt(i);
            // Increase frequency for the first string
            frequency.put(first, frequency.getOrDefault(first, 0) + 1);
            // Decrease frequency for the second string
            frequency.put(second, frequency.getOrDefault(second, 0) - 1);
        }
        // Check whether all frequencies are zero
        for (int count : frequency.values()) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        ValidAnagramOptimal solution = new ValidAnagramOptimal();
        System.out.println(solution.isAnagram("anagram", "nagaram"));
        System.out.println(solution.isAnagram("rat", "car"));
        System.out.println(solution.isAnagram("listen", "silent"));
        System.out.println(solution.isAnagram("hello", "world"));
    }
}