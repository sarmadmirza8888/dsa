/*
 * ------------------------------------------------------------
 * Problem    : 49. Group Anagrams
 * File       : GroupAnagramsOptimal.java
 * Approach   : Optimal (HashMap + Sorted Key)
 *
 * Description:
 * Sort every word alphabetically. The sorted word becomes
 * the key inside the HashMap. Words having the same sorted
 * key are grouped together because they are anagrams.
 *
 * Time Complexity  : O(n × k log k)
 * Space Complexity : O(n × k)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class GroupAnagramsOptimal {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (String word : strs) {
            // Convert word to character array
            char[] characters = word.toCharArray();
            // Sort characters
            Arrays.sort(characters);
            // Sorted word becomes the key
            String key = new String(characters);
            // Create a new group if key does not exist
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<>());
            }
            // Add original word into its group
            hashMap.get(key).add(word);
        }
        // Return all groups
        return new ArrayList<>(hashMap.values());
    }
    public static void main(String[] args) {
        GroupAnagramsOptimal solution = new GroupAnagramsOptimal();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(solution.groupAnagrams(strs));
    }
}