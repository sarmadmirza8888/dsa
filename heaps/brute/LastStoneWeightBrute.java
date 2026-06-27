/*
 * ------------------------------------------------------------
 * Problem    : 1046. Last Stone Weight
 * File       : LastStoneWeightBrute.java
 * Approach   : Brute Force (Sort Every Iteration)
 *
 * Description:
 * Repeatedly sort the array so the two largest stones are at
 * the end. Smash them together and continue until at most one
 * stone remains.
 *
 * Time Complexity  : O(n² log n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
class LastStoneWeightBrute {
    public int lastStoneWeight(int[] stones) {
        int size = stones.length;
        while (size > 1) {
            // Sort current stones
            Arrays.sort(stones, 0, size);
            int largest = stones[size - 1];
            int secondLargest = stones[size - 2];
            if (largest == secondLargest) {
                // Both stones destroyed
                size -= 2;
            } else {
                // Replace second largest with difference
                stones[size - 2] = largest - secondLargest;
                // Remove largest
                size--;
            }
        }
        if (size == 0)
            return 0;
        return stones[0];
    }
    public static void main(String[] args) {
        LastStoneWeightBrute solution = new LastStoneWeightBrute();
        int[] stones = {2,7,4,1,8,1};
        System.out.println(solution.lastStoneWeight(stones));
    }
}