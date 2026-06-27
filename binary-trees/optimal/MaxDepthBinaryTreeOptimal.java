/*
 * ------------------------------------------------------------
 * Problem    : 104. Maximum Depth of Binary Tree
 * File       : MaxDepthBinaryTreeOptimal.java
 * Approach   : Optimal (Recursive DFS)
 *
 * Description:
 * Recursively calculate the depth of the left and right
 * subtrees. The depth of the current node is
 * 1 + maximum(leftDepth, rightDepth).
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class MaxDepthBinaryTreeOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        int leftDepth = maxDepth(root.left);
        int rightDepth = maxDepth(root.right);
        return 1 + Math.max(leftDepth, rightDepth);
    }
    public static void main(String[] args) {
        MaxDepthBinaryTreeOptimal solution = new MaxDepthBinaryTreeOptimal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.maxDepth(root));
    }
}
