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
    public boolean isSys(TreeNode left,TreeNode right){
        if(left==null || right==null){
            return left==right;
        }

        if(left.val!=right.val){
            return false;
            }

        return isSys(left.left,right.right) && isSys(left.right,right.left);
    }
    public boolean isSymmetric(TreeNode root) {
        return root==null || isSys(root.left,root.right);
    }
}