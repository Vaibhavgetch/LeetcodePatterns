package DSA.Trees.BinaryTrees.Traversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


/*
* Author : @Vaibhavgetch
*   https://leetcode.com/problems/binary-tree-level-order-traversal/description/
* TC : O(n) , where n = no. of nodes
* SC : O(n) , the queue can store maximum of all nodes in worst case
*
* */
public class LevelWiseTraversalBFS {

    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        List<List<Integer>> ans = new ArrayList<>();

        /*
        *  Will follow RPA strategy
        * Remove the node
        * Print the Node
        * Add the chikdren of the node
        * */
        if (root == null) return new ArrayList<>();
        queue.offer(root);
        while (queue.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            int count = queue.size();
            // Remove the node
            for (int i = 0; i < count; i++) {
                TreeNode node = queue.remove();
                // Print the node
                temp.add(node.val);
                // Add children ;
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            ans.add(temp);
        }
    return ans ;
    }

}
