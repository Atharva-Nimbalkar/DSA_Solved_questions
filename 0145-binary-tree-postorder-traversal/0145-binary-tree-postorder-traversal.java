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
    public void findPost(TreeNode root,List<Integer>ls){
        if(root==null){
            return;
        }
        findPost(root.left,ls);
        findPost(root.right,ls);
        ls.add(root.val);

    }
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer>ls=new ArrayList<>();
        findPost(root,ls);
        return ls;
    }
}