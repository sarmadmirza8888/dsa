/*
 * ------------------------------------------------------------
 * Problem    : 215. Kth Largest Element in an Array
 * File       : KthLargestElementBrute.java
 * Approach   : Brute Force (Sort Descending)
 *
 * Description:
 * Sort the array in descending order.
 * Return the element at index (k - 1).
 *
 * Time Complexity  : O(n log n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Arrays;
import java.util.Collections;
class KthLargestElementBrute {
    public int findKthLargest(Integer[] nums, int k) {
        // Sort in descending order
        Arrays.sort(nums, Collections.reverseOrder());
        return nums[k - 1];
    }
    public static void main(String[] args) {
        KthLargestElementBrute solution = new KthLargestElementBrute();
        Integer[] nums = {3,2,1,5,6,4};
        int k = 2;
        System.out.println(solution.findKthLargest(nums, k));
    }
}
