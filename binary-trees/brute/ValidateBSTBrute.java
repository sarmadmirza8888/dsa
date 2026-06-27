/*
 * ------------------------------------------------------------
 * Problem    : 98. Validate Binary Search Tree
 * File       : ValidateBSTBrute.java
 * Approach   : Brute Force (Inorder Traversal)
 *
 * Description:
 * Perform an inorder traversal of the tree and store all
 * node values in an ArrayList. Since inorder traversal of
 * a BST is sorted in strictly increasing order, check if
 * the list is strictly increasing.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.ArrayList;
class ValidateBSTBrute {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
       }
    }
    ArrayList<Integer> list = new ArrayList<>();
    public boolean isValidBST(TreeNode root) {
        inorder(root);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) <= list.get(i - 1))
                return false;
        }
        return true;
    }
    private void inorder(TreeNode root) {
        if (root == null)
            return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }
    public static void main(String[] args) {
        ValidateBSTBrute solution = new ValidateBSTBrute();
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(solution.isValidBST(root));
    }
}