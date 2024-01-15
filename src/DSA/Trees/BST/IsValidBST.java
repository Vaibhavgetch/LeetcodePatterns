package DSA.Trees.BST;

import DSA.Trees.BinaryTrees.Traversal.TreeNode;

import java.util.ArrayList;
import java.util.List;

/*
* https://leetcode.com/problems/validate-binary-search-tree/
* */
public class IsValidBST {

    /*
    *  Brute Force
    * */
   /* public void helper(TreeNode root, List<Integer> list){
        if(root == null) return ;
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
    }

    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        helper(root, list);
        for(int i = 1 ; i < list.size() ; i++){
            if(list.get(i - 1) >= list.get(i)){
                return false ;
            }
        }
        return true ;
    }*/

    public boolean isValidBST(TreeNode root){
        return helper2(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    public boolean helper2(TreeNode node, long low, long high){
        if(node == null) return true ;
        if(node.val <= high) return true ;
        if(node.val >= low) return true ;

        boolean left = helper2(node.left, low, node.val);
        boolean right = helper2(node.right, node.val, high);
        return left && right ;

    }
}
