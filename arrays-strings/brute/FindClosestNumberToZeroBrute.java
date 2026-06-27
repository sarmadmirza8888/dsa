/*
 * ------------------------------------------------------------
 * Problem    : 2239. Find Closest Number to Zero
 * File       : FindClosestNumberToZeroBrute.java
 * Approach   : Brute Force (Nested Loops)
 *
 * Description:
 * Compare every element with every other element to determine
 * which number is closest to zero. If two numbers have the same
 * absolute distance from zero, return the larger number.
 
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 * ------------------------------------------------------------
 */

class FindClosestNumberToZeroBrute {

    public int findClosestNumber(int[] nums) {
        int ans = nums[0];

        for (int i = 0; i < nums.length; i++) {

            boolean isBest = true;

            for (int j = 0; j < nums.length; j++) {

                // Found a number closer to zero
                if (Math.abs(nums[j]) < Math.abs(nums[i])) {
                    isBest = false;
                    break;
                }

                // Same distance from zero, prefer the larger value
                if (Math.abs(nums[j]) == Math.abs(nums[i]) && nums[j] > nums[i]) {
                    isBest = false;
                    break;
                }
            }

            // Current number is the best candidate
            if (isBest) {
                ans = nums[i];
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -2, 1, 4, 8};

        System.out.println(
                new FindClosestNumberToZeroBrute().findClosestNumber(nums)
        ); // Output: 1
    }
}
