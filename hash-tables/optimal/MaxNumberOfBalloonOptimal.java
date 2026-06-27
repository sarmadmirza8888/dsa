/*
 * ------------------------------------------------------------
 * Problem    : 1189. Maximum Number of Balloons
 * File       : MaximumNumberOfBalloonsOptimal.java
 * Approach   : Optimal (HashMap Frequency Counter)
 *
 * Description:
 * Traverse the string once and store the frequency of each
 * character in a HashMap. The number of times "balloon"
 * can be formed depends on the minimum available count of
 * the required characters, considering that 'l' and 'o'
 * appear twice.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.HashMap;
class MaximumNumberOfBalloonsOptimal {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        // Count frequency of every character
        for (char ch : text.toCharArray()) {
            frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
        }
        int countB = frequency.getOrDefault('b', 0);
        int countA = frequency.getOrDefault('a', 0);
        int countL = frequency.getOrDefault('l', 0);
        int countO = frequency.getOrDefault('o', 0);
        int countN = frequency.getOrDefault('n', 0);
        return Math.min(
                Math.min(countB, countA),
                Math.min(Math.min(countL / 2, countO / 2), countN)
        );
    }
    public static void main(String[] args) {
        MaximumNumberOfBalloonsOptimal solution = new MaximumNumberOfBalloonsOptimal();
        System.out.println(solution.maxNumberOfBalloons("nlaebolko"));
        System.out.println(solution.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(solution.maxNumberOfBalloons("leetcode"));
    }
}