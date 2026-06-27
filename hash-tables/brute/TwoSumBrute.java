/*
 * ------------------------------------------------------------
 * Problem    : 1. Two Sum
 * File       : TwoSumBrute.java
 * Approach   : Brute Force (Check All Pairs)
 *
 * Description:
 * Check every possible pair of elements in the array.
 * If the sum of two elements equals the target, return
 * their indices.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
class TwoSumBrute {
    public int[] twoSum(int[] nums, int target) {
        // Check every pair
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        // No solution (never reached according to problem)
        return new int[]{-1, -1};
    }
    public static void main(String[] args) {
        TwoSumBrute solution = new TwoSumBrute();
        int[] nums1 = {2,7,11,15};
        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        System.out.println(Arrays.toString(solution.twoSum(nums1, 9)));
        System.out.println(Arrays.toString(solution.twoSum(nums2, 6)));
        System.out.println(Arrays.toString(solution.twoSum(nums3, 6)));
    }
}