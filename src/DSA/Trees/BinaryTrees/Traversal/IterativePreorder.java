package DSA.Trees.BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativePreorder {

    public List<Integer> preOrderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();

        if (root == null) return new ArrayList<>();
        stk.push(root);

        while (stk.size() > 0) {
            //Remove
            root = stk.pop();
            ans.add(root.val);

            // check if right child is present, ifPresent() --> add to stack
            // we are adding right first to preserve stack property
            if (root.right != null) {
                stk.push(root.right);
            }
            if (root.left != null) {
                stk.push(root.left);
            }
        }
        return ans;
    }
}
