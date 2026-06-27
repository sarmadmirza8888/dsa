/*
 * ------------------------------------------------------------
 * Problem    : 217. Contains Duplicate
 * File       : ContainsDuplicateOptimal.java
 * Approach   : Optimal (Hash Table / HashSet)
 *
 * Description:
 * Use a HashSet (implemented using a hash table) to store
 * each number while traversing the array. Before inserting
 * a number, check whether it already exists in the HashSet.
 * If it does, a duplicate has been found.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.HashSet;
class ContainsDuplicateOptimal {
    public boolean containsDuplicate(int[] nums) {
        // Hash table to store unique elements
        HashSet<Integer> hashTable = new HashSet<>();
        // Traverse every element in the array
        for (int currentNumber : nums) {
            // If the element already exists, duplicate found
            if (hashTable.contains(currentNumber)) {
                return true;
            }
            // Insert the current element into the hash table
            hashTable.add(currentNumber);
        }
        // No duplicates found
        return false;
    }
    public static void main(String[] args) {
        ContainsDuplicateOptimal solution = new ContainsDuplicateOptimal();
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 2, 3, 4};
        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println("Output: " + solution.containsDuplicate(nums1));
        System.out.println();
        System.out.println("Output: " + solution.containsDuplicate(nums2));
        System.out.println();
        System.out.println("Output: " + solution.containsDuplicate(nums3));
    }
}