package Trees.BinaryTrees.Medium;

import Trees.BinaryTrees.Traversal.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/*
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * SOln : https://www.youtube.com/watch?v=uCvur520ejA
 * */
public class MinDepthOfBT {

    /*
     *  Using BFS, extra space of Queue
     * */
    public int minDepth1(TreeNode root) {
        if (root == null) return 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int level = 1;
        while (q.size() > 0) {
            int count = q.size();

            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (curr.left == null && curr.right == null) {
                    return level;
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
            level++;
        }
        return level;
    }

    /*
     *  Using BFS
     * */

    public int minDepth2(TreeNode root) {
        if (root == null) return 0;
        return helper(root);
    }

    private int helper(TreeNode curr) {
        if (curr == null) return Integer.MAX_VALUE;
        if (curr.left == null && curr.right == null) {
            return 1;
        }
        int left = helper(curr.left);
        int right = helper(curr.right);

        return Math.min(left, right) + 1;
    }
}
