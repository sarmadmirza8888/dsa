/*
 * ------------------------------------------------------------
 * Problem    : 11. Container With Most Water
 * File       : ContainerWithMostWaterBrute.java
 * Approach   : Brute Force (Check All Pairs)
 *
 * Description:
 * Consider every possible pair of vertical lines. Calculate
 * the area formed by each pair and keep track of the maximum
 * area encountered.
 *
 * Area = min(height[i], height[j]) × (j - i)
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class ContainerWithMostWaterBrute {
    public int maxArea(int[] height) {
        int maximumArea = 0;
        // Choose the left boundary
        for (int left = 0; left < height.length - 1; left++) {
            // Choose the right boundary
            for (int right = left + 1; right < height.length; right++) {
                // Width of the container
                int width = right - left;
                // Height of the container
                int containerHeight = Math.min(height[left], height[right]);
                // Calculate area
                int currentArea = width * containerHeight;
                // Update maximum area
                if (currentArea > maximumArea) {
                    maximumArea = currentArea;
                }
            }
        }
        return maximumArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWaterBrute solution = new ContainerWithMostWaterBrute();
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        System.out.println("Maximum Area: " + solution.maxArea(height1));
        System.out.println("Maximum Area: " + solution.maxArea(height2));
    }
}