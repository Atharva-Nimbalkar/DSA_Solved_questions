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
        // brute force takes extra space complexity
        //so
        //using recursive 
        // tc O(n)
        // sc(N)

    if(root==null || root==p || root==q){
        return root;
    }

    TreeNode left=lowestCommonAncestor(root.left,p,q);
    TreeNode right=lowestCommonAncestor(root.right,p,q);

    //result
    if(left==null){
        return right;
    }
    if(right==null){
        return left;
    }
    else{
        //when both are not all we get result
        return root;
    }
    }
}