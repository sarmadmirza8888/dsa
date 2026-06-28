/*
 * ------------------------------------------------------------
 * Problem    : 530. Minimum Absolute Difference in BST
 * File       : MinAbsDifferenceBSTOptimal.java
 * Approach   : Optimal (Inorder + Previous Pointer)
 *
 * Description:
 * Perform an inorder traversal of the BST.
 * Since inorder traversal is sorted, compare each node only
 * with the previously visited node.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class MinAbsDifferenceBSTOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    Integer prev = null;
    int minDiff = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        if (prev != null) {
            minDiff = Math.min(minDiff, root.val - prev);
        }
        prev = root.val;
        inorder(root.right);
    }
    public static void main(String[] args) {
        MinAbsDifferenceBSTOptimal solution = new MinAbsDifferenceBSTOptimal();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        System.out.println(solution.getMinimumDifference(root));
    }
}