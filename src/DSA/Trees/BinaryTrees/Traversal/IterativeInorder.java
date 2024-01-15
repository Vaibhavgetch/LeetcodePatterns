package DSA.Trees.BinaryTrees.Traversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class IterativeInorder {

    public static void main(String[] args) {
        IterativeInorder obj = new IterativeInorder();
        List<Integer> integers = obj.inorderTraversal(new TreeNode(5));
        System.out.println(integers);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Stack<TreeNode> stk = new Stack<>();
        TreeNode node = root;
        while (true) {
            if (node != null) {
                stk.push(node);
                node = node.left;
            } else {
                if (stk.isEmpty()) {
                    break;
                }
                node = stk.pop();
                ans.add(node.val);
                node = node.right;
            }
        }
        return ans;
    }
}
