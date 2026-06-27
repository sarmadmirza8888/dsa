import java.util.ArrayList;
import java.util.List;

/*
 * ------------------------------------------------------------
 * Problem    : 228. Summary Ranges
 * File       : SummaryRangesBrute.java
 * Approach   : Brute Force (Nested Loops)
 *
 * Description:
 * For each starting element, repeatedly scan the remaining
 * array to find the next consecutive number. Continue until
 * the range ends, then add the range to the result.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(1) (excluding output list)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */

class SummaryRangesBrute{
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {

            int start = nums[i];
            int current = start;

            // Keep searching for the next consecutive number
            while (true) {

                boolean found = false;

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] == current + 1) {
                        current = nums[j];
                        i = j;
                        found = true;
                        break;
                    }
                }

                if (!found)
                    break;
            }

            if (start == current)
                result.add(String.valueOf(start));
            else
                result.add(start + "->" + current);

            i++;
        }

        return result;
    }

    public static void main(String[] args) {

        SummaryRangesBrute solution = new SummaryRangesBrute();

        int nums[] = {0,1,2,4,5,7};

        System.out.println(solution.summaryRanges(nums));
    }
}
