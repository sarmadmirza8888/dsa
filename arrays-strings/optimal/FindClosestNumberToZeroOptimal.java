/*
 * ------------------------------------------------------------
 * Problem    : 2239. Find Closest Number to Zero
 * File       : FindClosestNumberToZeroOptimal.java
 * Approach   : Optimal (Single Traversal)
 *
 * Description:
 * Traverse the array only once while keeping track of the
 * number closest to zero. If two numbers have the same
 * absolute distance from zero, return the larger number.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * ------------------------------------------------------------
 */

class FindClosestNumberToZeroOptimal {
    public int findClosestNumber(int[] nums) {
        // Assume the first element is the closest initially.
        int closestNumber = nums[0];
        // Traverse the array once.
        for (int currentNumber : nums) {

            // If the current number is closer to zero,
            // update the closest number.
            if (Math.abs(currentNumber) < Math.abs(closestNumber)) {
                closestNumber = currentNumber;
            }

            // If both numbers are equally close to zero,
            // choose the larger value (positive wins).
            else if (Math.abs(currentNumber) == Math.abs(closestNumber)
                    && currentNumber > closestNumber) {
                closestNumber = currentNumber;
            }
        }
        // Return the closest number found.
        return closestNumber;
    }
    public static void main(String[] args) {
        FindClosestNumberToZeroOptimal solution = new FindClosestNumberToZeroOptimal();
        int[] nums1 = {-4, -2, 1, 4, 8};
        System.out.println("Test Case 1");
        System.out.println("Input : {-4, -2, 1, 4, 8}");
        System.out.println("Output: " + solution.findClosestNumber(nums1));
        System.out.println();
    }
}