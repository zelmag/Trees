/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }else{
            return help(1,root);
        }
    }
    public int help(int currDepth, TreeNode n){
        if(n.left == null && n.right == null){
            return currDepth; 
        }else{
            int leftDepth = Integer.MIN_VALUE, rightDepth = Integer.MIN_VALUE; 
            if(n.left != null){
                leftDepth = help(currDepth+1,n.left);
            }
            if(n.right != null){
                rightDepth = help(currDepth+1,n.right);
            }
            return Math.max(leftDepth, rightDepth);
        }
    }
}
