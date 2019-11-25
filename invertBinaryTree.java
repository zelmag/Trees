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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return root;
        }
        invert(root);
        return root; 
    }
    public void invert(TreeNode n){
        if(n == null){
            return;
        }
        TreeNode temp = n.left;
        n.left = n.right;
        n.right = temp;
        invert(n.left);
        invert(n.right);
    }
}
