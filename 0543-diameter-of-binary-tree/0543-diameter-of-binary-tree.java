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
    public int findHeight(TreeNode root){
        if (root == null) return 0;
        return 1 + Math.max(findHeight(root.left), findHeight(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {

        //This is navie solution 
        //Tc: O(nsquare)
        if (root == null) return 0;

        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        int currentDiameter = leftHeight + rightHeight;

        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        return Math.max(currentDiameter, Math.max(leftDiameter, rightDiameter));
    }
}