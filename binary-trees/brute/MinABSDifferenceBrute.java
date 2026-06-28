/*
 * ------------------------------------------------------------
 * Problem    : 530. Minimum Absolute Difference in BST
 * File       : MinAbsDifferenceBSTBrute.java
 * Approach   : Brute Force (Inorder + Compare Every Pair)
 *
 * Description:
 * Store the inorder traversal of the BST into an ArrayList.
 * Compare every possible pair of values and return the
 * smallest absolute difference.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
class MinAbsDifferenceBSTBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    ArrayList<Integer> list = new ArrayList<>();
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        int minDiff = Integer.MAX_VALUE;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                minDiff = Math.min(minDiff, Math.abs(list.get(i) - list.get(j)));
            }
        }
        return minDiff;
    }
    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        MinAbsDifferenceBSTBrute solution = new MinAbsDifferenceBSTBrute();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(solution.getMinimumDifference(root));
    }
}