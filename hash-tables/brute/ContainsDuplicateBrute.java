/*
 * ------------------------------------------------------------
 * Problem    : 217. Contains Duplicate
 * File       : ContainsDuplicateBrute.java
 * Approach   : Brute Force (Sorting)
 *
 * Description:
 * Sort the array so that duplicate elements become adjacent.
 * Traverse the sorted array and compare each element with its
 * next element. If two adjacent elements are equal, return
 * true; otherwise, return false.
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(1) (Ignoring sorting implementation)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
class ContainsDuplicateBrute {
    public boolean containsDuplicate(int[] nums) {
        // Sort the array
        Arrays.sort(nums);
        // Compare adjacent elements
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        // No duplicates found
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicateBrute solution = new ContainsDuplicateBrute();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(solution.containsDuplicate(nums1));
        System.out.println(solution.containsDuplicate(nums2));
        System.out.println(solution.containsDuplicate(nums3));
    }
}