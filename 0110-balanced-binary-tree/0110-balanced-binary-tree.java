/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int bfsheight(TreeNode root){
        // TC: O(n) instead O(nsquare)
        if(root==null)return 0;
        int lh=bfsheight(root.left);
        if(lh==-1)return -1;
        int rh=bfsheight(root.right);
        if(rh==-1)return -1;
        
        if(Math.abs(lh-rh)>1)return -1;
        return Math.max(lh,rh)+1;
    }
    public boolean isBalanced(TreeNode root) {
       return bfsheight(root)!=-1;     
    }
}