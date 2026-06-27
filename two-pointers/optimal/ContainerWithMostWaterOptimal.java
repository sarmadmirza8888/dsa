/*
 * ------------------------------------------------------------
 * Problem    : 11. Container With Most Water
 * File       : ContainerWithMostWaterOptimal.java
 * Approach   : Optimal (Two Pointers)
 *
 * Description:
 * Place one pointer at the beginning and one at the end of
 * the array. Compute the current area and move the pointer
 * with the shorter height inward, since moving the taller
 * line cannot increase the area while the width decreases.
 *
 * Area = min(height[left], height[right]) × (right - left)
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class ContainerWithMostWaterOptimal {
    public int maxArea(int[] height) {
        // Pointer at the beginning
        int left = 0;
        // Pointer at the end
        int right = height.length - 1;
        // Store the maximum area
        int maximumArea = 0;
        // Continue until both pointers meet
        while (left < right) {
            // Width of the container
            int width = right - left;
            // Height of the container
            int containerHeight = Math.min(height[left], height[right]);
            // Calculate current area
            int currentArea = width * containerHeight;
            // Update maximum area
            if (currentArea > maximumArea) {
                maximumArea = currentArea;
            }
            // Move the pointer with the smaller height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return maximumArea;
    }
    public static void main(String[] args) {
        ContainerWithMostWaterOptimal solution = new ContainerWithMostWaterOptimal();
        int[] height1 = {1,8,6,2,5,4,8,3,7};
        int[] height2 = {1,1};
        System.out.println("Maximum Area: " + solution.maxArea(height1));
        System.out.println("Maximum Area: " + solution.maxArea(height2));
    }
}