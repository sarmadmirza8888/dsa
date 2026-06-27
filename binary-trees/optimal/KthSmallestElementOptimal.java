/*
 * ------------------------------------------------------------
 * Problem    : 230. Kth Smallest Element in a BST
 * File       : KthSmallestElementOptimal.java
 * Approach   : Optimal (Iterative Inorder Traversal)
 *
 * Description:
 * Perform inorder traversal using a stack.
 * Stop immediately when the kth smallest element
 * is visited.
 *
 * Time Complexity  : O(k) (Worst O(n))
 * Space Complexity : O(h)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.Stack;
class KthSmallestElementOptimal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val) {
            this.val = val;
        }
    }
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while (current != null || !stack.isEmpty()) {
            // Go to the leftmost node
            while (current != null) {
                stack.push(current);
                current = current.left;
            }
            // Visit node
            current = stack.pop();
            k--;
            if (k == 0)
                return current.val;
            // Move to right subtree
            current = current.right;
        }

        return -1;
    }

    public static void main(String[] args) {
        KthSmallestElementOptimal solution = new KthSmallestElementOptimal();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        int k = 1;
        System.out.println(solution.kthSmallest(root, k));
    }
}