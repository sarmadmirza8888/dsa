/*
 * ------------------------------------------------------------
 * Problem    : 1046. Last Stone Weight
 * File       : LastStoneWeightOptimal.java
 * Approach   : Optimal (Max Heap / PriorityQueue)
 *
 * Description:
 * Store all stones in a max heap.
 * Repeatedly remove the two heaviest stones.
 * If they are different, insert their difference back into
 * the heap.
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

import java.util.Collections;
import java.util.PriorityQueue;
class LastStoneWeightOptimal {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        // Insert all stones
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() > 1) {
            int first = maxHeap.poll();      // Largest
            int second = maxHeap.poll();     // Second Largest
            if (first != second) {
                maxHeap.offer(first - second);
            }
        }
        if (maxHeap.isEmpty())
            return 0;
        return maxHeap.poll();
    }
    public static void main(String[] args) {
        LastStoneWeightOptimal solution = new LastStoneWeightOptimal();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(solution.lastStoneWeight(stones));
    }
}