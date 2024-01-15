package DSA.Trees.BinaryTrees.Medium;

import DSA.Trees.BinaryTrees.Traversal.TreeNode;

/*
* https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
* */
public class FlattenBinaryTreeToLL {

    public void flatten(TreeNode root) {
        /*Morris Traversal*/
        if(root == null) return ;

        TreeNode curr = root ;
        while(curr != null){
            if(curr.left != null){
                TreeNode temp = curr.left ;
                while(temp.right != null){
                    temp = temp.right ;
                }
                temp.right = curr.right;
                curr.right = curr.left;
                curr.left = null;
            }
            curr = curr.right ;
        }
    }

}

