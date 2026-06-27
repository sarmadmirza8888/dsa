/*
 * ------------------------------------------------------------
 * Problem    : 49. Group Anagrams
 * File       : GroupAnagramsBrute.java
 * Approach   : Brute Force (Compare Every Pair)
 *
 * Description:
 * Compare every string with every other string. If two
 * strings are anagrams, place them in the same group.
 * Use a visited array to avoid processing the same string
 * multiple times.
 *
 * Time Complexity  : O(n² × k)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.List;
class GroupAnagramsBrute {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        boolean[] visited = new boolean[strs.length];
        for (int i = 0; i < strs.length; i++) {
            if (visited[i])
                continue;
            List<String> group = new ArrayList<>();
            group.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if (!visited[j] && isAnagram(strs[i], strs[j])) {
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            result.add(group);
        }
        return result;
    }
    // Compare two strings using character frequencies
    private boolean isAnagram(String first, String second) {
        if (first.length() != second.length())
            return false;
        int[] frequency = new int[26];
        for (int i = 0; i < first.length(); i++) {
            frequency[first.charAt(i) - 'a']++;
            frequency[second.charAt(i) - 'a']--;
        }
        for (int count : frequency) {
            if (count != 0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        GroupAnagramsBrute solution = new GroupAnagramsBrute();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}