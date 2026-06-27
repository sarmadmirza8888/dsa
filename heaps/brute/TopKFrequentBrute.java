/*
 * ------------------------------------------------------------
 * Problem    : 347. Top K Frequent Elements
 * File       : TopKFrequentBrute.java
 * Approach   : Brute Force (Sort by Frequency)
 *
 * Description:
 * Count the frequency of every element using a HashMap.
 * Store the unique elements in a list.
 * Sort the list according to frequency in descending order.
 * Return the first k elements.
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.*
class TopKFrequentBrute {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        // Count frequencies
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        // Store unique numbers
        ArrayList<Integer> list = new ArrayList<>(frequency.keySet());
        // Sort according to frequency (highest first)
        Collections.sort(list, (a, b) -> frequency.get(b) - frequency.get(a));
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentBrute solution = new TopKFrequentBrute();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}