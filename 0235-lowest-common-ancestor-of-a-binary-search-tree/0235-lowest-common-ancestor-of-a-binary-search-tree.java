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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // tc : O(logn)
        // sp:O(1) 
        //as this is bst 
        //there 4 condition 1. p&q both on lhs 2.p&q both on rhs 
        // 3.if both nodes are splitted then return root(obivous) 4.if any of p and q is root return root 
        if(root==null) return null;

        if(p.val>root.val && q.val>root.val){
            return lowestCommonAncestor(root.right,p,q);
        }
        else if(p.val<root.val && q.val < root.val){
            return lowestCommonAncestor(root.left,p,q);
            }
        else{
            return root;
        }

    }
}