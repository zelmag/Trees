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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null || q == null){
            return p == null && q == null;
        }
        //preoder traversal. root then left then right
        return help(p,q);
    }
    public boolean help(TreeNode p, TreeNode q){
        if(p == null || q == null){
            return p == null && q == null;
        }
        if(p.val != q.val){
            return false; 
        }
        boolean eq = help(p.left,q.left) && help(p.right,q.right);
        return eq;
    }
}
