package Trees.BinaryTrees.Traversal;


import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/problems/binary-tree-preorder-traversal/
* */
public class PreOrderTraversal {

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        helper(root, ans);
        return ans;
    }

    public void helper(TreeNode node, List<Integer> ans) {
        if (node == null) {
            return;
        }
        ans.add(node.val);
        helper(node.left, ans);
        helper(node.right, ans);
    }

}
