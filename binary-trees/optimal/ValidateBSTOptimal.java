/*
 * ------------------------------------------------------------
 * Problem    : 98. Validate Binary Search Tree
 * File       : ValidateBSTOptimal.java
 * Approach   : Optimal (DFS with Min/Max Bounds)
 *
 * Description:
 * Every node must lie within a valid range.
 * Left subtree values must be smaller than the current node.
 * Right subtree values must be greater than the current node.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
class ValidateBSTOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    private boolean validate(TreeNode root, long min, long max) {
        if (root == null)
            return true;
        if (root.val <= min || root.val >= max)
            return false;
        return validate(root.left, min, root.val) &&
                validate(root.right, root.val, max);
    }
    public static void main(String[] args) {
        ValidateBSTOptimal solution = new ValidateBSTOptimal();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(solution.isValidBST(root));
    }
}