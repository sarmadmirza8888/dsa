/*
 * ------------------------------------------------------------
 * Problem    : 347. Top K Frequent Elements
 * File       : TopKFrequentOptimal.java
 * Approach   : Optimal (Min Heap)
 *
 * Description:
 * Count frequencies using a HashMap.
 * Store only the k most frequent elements inside a
 * Min Heap ordered by frequency.
 *
 * Time Complexity  : O(n log k)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.*;
class TopKFrequentOptimal {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> frequency = new HashMap<>();
        // Count frequencies
        for (int num : nums) {
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }
        // Min Heap based on frequency
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a, b) -> frequency.get(a) - frequency.get(b));
        for (int num : frequency.keySet()) {
            minHeap.offer(num);
            if (minHeap.size() > k) {
                minHeap.poll();
            }
        }
        int[] result = new int[k];
        for (int i = k - 1; i >= 0; i--) {
            result[i] = minHeap.poll();
        }
        return result;
    }
    public static void main(String[] args) {
        TopKFrequentOptimal solution = new TopKFrequentOptimal();
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        int[] ans = solution.topKFrequent(nums, k);
        System.out.println(Arrays.toString(ans));
    }
}