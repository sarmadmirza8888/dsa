/*
 * ------------------------------------------------------------
 * Problem    : 1189. Maximum Number of Balloons
 * File       : MaximumNumberOfBalloonsBrute.java
 * Approach   : Brute Force (Manual Character Counting)
 *
 * Description:
 * Traverse the string separately for each required character
 * ('b', 'a', 'l', 'o', and 'n'). Count their occurrences and
 * determine how many times the word "balloon" can be formed.
 *
 * Time Complexity  : O(5n) ≈ O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class MaximumNumberOfBalloonsBrute {
    public int maxNumberOfBalloons(String text) {
        int countB = 0;
        int countA = 0;
        int countL = 0;
        int countO = 0;
        int countN = 0;
        // Count 'b'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'b')
                countB++;
        }
        // Count 'a'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a')
                countA++;
        }
        // Count 'l'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'l')
                countL++;
        }
        // Count 'o'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'o')
                countO++;
        }
        // Count 'n'
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'n')
                countN++;
        }
        return Math.min(
                Math.min(countB, countA),
                Math.min(Math.min(countL / 2, countO / 2), countN)
        );
    }
    public static void main(String[] args) {
        MaximumNumberOfBalloonsBrute solution = new MaximumNumberOfBalloonsBrute();
        System.out.println(solution.maxNumberOfBalloons("nlaebolko"));
        System.out.println(solution.maxNumberOfBalloons("loonbalxballpoon"));
        System.out.println(solution.maxNumberOfBalloons("leetcode"));
    }
}