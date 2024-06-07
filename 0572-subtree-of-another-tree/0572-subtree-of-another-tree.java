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
    // If assum m is the number of nodes in the 1st tree and n is the number of nodes in the 2nd tree, then
// Time complexity: O(m*n),

// Space complexity: O(height of 1str tree)(Or you can say: O(m) for worst case,
 // O(logm) for average case)
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null) return false;
        if (isSameTree(root, subRoot)) return true;
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

     private boolean isSameTree(TreeNode s, TreeNode t) {
        if (s == null && t == null) return true;
        if (s == null || t == null) return false;
        
        if (s.val != t.val) return false;
        
        return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
    }
}