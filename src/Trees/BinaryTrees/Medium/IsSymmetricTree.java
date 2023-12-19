package Trees.BinaryTrees.Medium;

import Trees.BinaryTrees.Traversal.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSymmetricTree {

    /*
     *   DFS approach using recursion
     * */
    public boolean isSymmetricDFS(TreeNode root) {
        return root == null || isMirror(root.left, root.right);
    }
    public boolean isMirror(TreeNode left, TreeNode right) {
        if (left == null || right == null) {
            return left == right;
        }
        if (left.val != right.val) return false;
        // check LL and RR
        boolean llrr = isMirror(left.left, right.right);
        // check Lr and RL
        boolean lrrl = isMirror(left.right, right.left);
        return llrr && lrrl;
    }


    /*
    *   Using Queue, levelOrder Traversal
    * */
    public boolean isSymmetricBFS(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);
        while(!q.isEmpty()){
            TreeNode left  = q.poll();
            TreeNode right = q.poll();
            if(left==null && right == null)   continue ;
            if(left==null || right == null) return false ;
            if(left.val != right.val)
                return false ;

            q.add(left.left);
            q.add(right.right);
            q.add(left.right);
            q.add(right.left);
        }
        return true ;
    }
}

