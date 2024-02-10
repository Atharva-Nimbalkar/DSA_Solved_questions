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


    private int findMaxPathSum(TreeNode node, int[] maxi) {
        if (node == null) return 0;
        int left = Math.max(0, findMaxPathSum(node.left, maxi));
        int right = Math.max(0, findMaxPathSum(node.right, maxi));
        maxi[0] = Math.max(maxi[0], left + right + node.val);
        return Math.max(left, right) + node.val;
    }
    
    public int maxPathSum(TreeNode root) {
        int[] maxi = {Integer.MIN_VALUE}; // Using an array to store the max value
        findMaxPathSum(root, maxi);
        return maxi[0];
    }
}