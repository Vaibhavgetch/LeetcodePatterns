package DSA.Trees.BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;


/*
*  https://leetcode.com/problems/binary-tree-inorder-traversal/
* */
public class InOrderTraversal {

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public void helper(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        helper(node.left, ans);
        ans.add(node.val);
        helper(node.right, ans);

    }
}
