/*
 * ------------------------------------------------------------
 * Problem    : 543. Diameter of Binary Tree
 * File       : DiameterBinaryTreeOptimal.java
 * Approach   : Optimal (Single DFS)
 *
 * Description:
 * Perform one DFS traversal.
 * At each node calculate left and right heights.
 * Update the maximum diameter while returning height.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class DiameterBinaryTreeOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        height(root);
        return diameter;
    }
    private int height(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public static void main(String[] args) {
        DiameterBinaryTreeOptimal solution = new DiameterBinaryTreeOptimal();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.diameterOfBinaryTree(root));
    }
}