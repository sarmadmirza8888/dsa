/*
 * ------------------------------------------------------------
 * Problem    : 543. Diameter of Binary Tree
 * File       : DiameterBinaryTreeBrute.java
 * Approach   : Brute Force (Height for Every Node)
 *
 * Description:
 * For every node, calculate the height of its left and
 * right subtree. The diameter passing through that node is
 * leftHeight + rightHeight. Return the maximum diameter.
 *
 * Time Complexity  : O(n²)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class DiameterBinaryTreeBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null)
            return 0;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        int currentDiameter = leftHeight + rightHeight;
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);
        return Math.max(currentDiameter,
                Math.max(leftDiameter, rightDiameter));
    }
    private int height(TreeNode root) {
        if (root == null)
            return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }
    public static void main(String[] args) {
        DiameterBinaryTreeBrute solution = new DiameterBinaryTreeBrute();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        System.out.println(solution.diameterOfBinaryTree(root));
    }
}