/*
 * ------------------------------------------------------------
 * Problem    : 104. Maximum Depth of Binary Tree
 * File       : MaxDepthBinaryTreeBrute.java
 * Approach   : Brute Force (BFS / Level Order Traversal)
 *
 * Description:
 * Traverse the tree level by level using a Queue.
 * Count the number of levels visited.
 * The total number of levels is the maximum depth.
 *
 * Time Complexity  : O(n)
 * Space Complexity : O(n)
 *
 * Author : Sarmad Mirza
 * ------------------------------------------------------------
 */
import java.util.LinkedList;
import java.util.Queue;
class MaxDepthBinaryTreeBrute {
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
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int depth = 0;
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode current = queue.poll();
                if (current.left != null)
                    queue.offer(current.left);
                if (current.right != null)
                    queue.offer(current.right);
            }
            depth++;
        }
        return depth;
    }
    public static void main(String[] args) {
        MaxDepthBinaryTreeBrute solution = new MaxDepthBinaryTreeBrute();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(solution.maxDepth(root));
    }
}