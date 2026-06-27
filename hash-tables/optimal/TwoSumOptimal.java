/*
 * ------------------------------------------------------------
 * Problem    : 1. Two Sum
 * File       : TwoSumOptimal.java
 * Approach   : Optimal (Hash Map)
 *
 * Description:
 * Traverse the array once while storing each number and its
 * index in a HashMap. For each element, calculate its
 * complement (target - current number). If the complement
 * already exists in the HashMap, return the stored index and
 * the current index.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
import java.util.HashMap;
class TwoSumOptimal {
    public int[] twoSum(int[] nums, int target) {
        // HashMap stores: Number -> Index
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        // Traverse the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the required complement
            int complement = target - nums[i];
            // If complement already exists, return both indices
            if (hashMap.containsKey(complement)) {
                return new int[]{
                        hashMap.get(complement), i
                };
            }
            // Store current number and its index
            hashMap.put(nums[i], i);
        }
        // No solution (never reached according to problem)
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSumOptimal solution = new TwoSumOptimal();
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        System.out.println(Arrays.toString(solution.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, 6)));
        System.out.println(Arrays.toString(solution.twoSum(nums3, 6)));
    }
}