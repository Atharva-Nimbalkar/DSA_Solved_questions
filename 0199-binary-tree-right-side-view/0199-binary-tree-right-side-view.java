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
    public List<Integer> rightSideView(TreeNode root) {
        // List<Integer>res=new ArrayList<>();
        // if(root==null) return res;
        //  res.add(root.val);
        // if(root.right!=null) {
        //     res.add(root.right.val);
        // if(root.right.left!=null)res.add(root.right.left.val);
        // if(root.right.right!=null) res.add(root.right.right.val);
                
        // }
        // else{
        //     return res;
        // }
        // return res;

        //recursion dfs
        //tc: O(n)
        //sc: O(ht)
        List<Integer>res= new ArrayList<>();
        rightView(root,res,0);
        return res;
    }

    public void rightView(TreeNode root,List<Integer>res,int level){
        if(root==null) return ;
        if(res.size()==level) res.add(root.val);
        if(root.right!=null) rightView(root.right,res,level+1);
        if(root.left!=null) rightView(root.left,res,level+1); 
    }
}