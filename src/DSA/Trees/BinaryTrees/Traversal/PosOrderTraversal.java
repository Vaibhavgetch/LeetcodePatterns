package DSA.Trees.BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/problems/binary-tree-postorder-traversal/
* */
public class PosOrderTraversal {

    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public void helper(TreeNode node, List<Integer> ans) {
        if (node == null) return;

        helper(node.left, ans);
        helper(node.right, ans);
        ans.add(node.val);
    }
}
