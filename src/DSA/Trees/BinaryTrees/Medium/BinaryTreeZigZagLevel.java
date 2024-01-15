package DSA.Trees.BinaryTrees.Medium;


import DSA.Trees.BinaryTrees.Traversal.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/*
*   https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/
* */
public class BinaryTreeZigZagLevel {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null) return new ArrayList<>() ;

        Deque<TreeNode> dq = new ArrayDeque<>();
        List<List<Integer>> result = new ArrayList<>();
         boolean reversed = false ;
         dq.addFirst(root);

         while(dq.size() > 0){
             int count = dq.size();
             List<Integer> temp = new ArrayList<>();
             for(int i = 0 ; i < count ; i++){
                 if(!reversed){
                    TreeNode curr = dq.removeFirst();
                    temp.add(curr.val);
                    if(curr.left != null) dq.addLast(curr.left);
                    if(curr.right != null) dq.addLast(curr.right);
                 }
                 else{
                     TreeNode curr = dq.removeLast();
                     temp.add(curr.val);
                     if(curr.left != null) dq.addFirst(curr.left);
                     if(curr.right != null) dq.addFirst(curr.right);
                 }
                 result.add(temp);
                 reversed = !reversed;
             }
         }
         return result ;
    }
}
