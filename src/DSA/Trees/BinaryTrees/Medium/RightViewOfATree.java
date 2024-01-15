package DSA.Trees.BinaryTrees.Medium;

import DSA.Trees.BinaryTrees.Traversal.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;


/*
* https://leetcode.com/problems/binary-tree-right-side-view/
*
*  Do levelOrder Traversal, add in ans only if dealing with last element of the level
* */
public class RightViewOfATree {

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return new ArrayList<>();
        ;

        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new ArrayDeque<>();
        q.offer(root);

        while (q.size() > 0) {
            List<Integer> temp = new ArrayList<>();
            int count = q.size();
            for (int i = 0; i < count; i++) {
                TreeNode curr = q.poll();
                if (i == count - 1) {
                    ans.add(curr.val);
                }
                if (curr.left != null) q.offer(curr.left);
                if (curr.right != null) q.offer(curr.right);
            }
        }
        return ans;
    }
}
