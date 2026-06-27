import java.util.ArrayList;
import java.util.List;
/*
 * ------------------------------------------------------------
 * Problem    : 228. Summary Ranges
 * File       : SummaryRangesOptimal.java
 * Approach   : Optimal (Single Pass)
 *
 * Description:
 * Traverse the array only once while keeping track of the
 * start of the current range. Extend the range as long as
 * consecutive numbers are found, then store the completed
 * range in the result.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(1) (excluding output list)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

class SummaryRangesOptimal {

    public List<String> summaryRanges(int[] nums) {

        List<String> result = new ArrayList<>();

        int i = 0;

        while (i < nums.length) {

            // Beginning of the current range
            int start = nums[i];

            // Extend the range while numbers are consecutive
            while (i + 1 < nums.length &&
                    nums[i + 1] == nums[i] + 1) {
                i++;
            }

            // End of the current range
            int end = nums[i];

            // Store the range
            if (start == end)
                result.add(String.valueOf(start));
            else
                result.add(start + "->" + end);

            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        SummaryRangesOptimal solution = new SummaryRangesOptimal();

        int nums1[] = {0,1,2,4,5,7};
        int nums2[] = {0,2,3,4,6,8,9};

        System.out.println(solution.summaryRanges(nums1));
        System.out.println(solution.summaryRanges(nums2));
    }
}