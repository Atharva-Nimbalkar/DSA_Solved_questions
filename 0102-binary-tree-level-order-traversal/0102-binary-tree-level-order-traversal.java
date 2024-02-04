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
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode>queue=new LinkedList<TreeNode>();
        List<List<Integer>>ls=new LinkedList<List<Integer>>();
        if(root==null) return ls;
        queue.offer(root);//add a root node 
        while(!queue.isEmpty()){
            int levelNum=queue.size();
            List<Integer>sub_ls=new LinkedList<Integer>();
            for(int i=0;i<levelNum;i++){
                if(queue.peek().left!=null) queue.offer(queue.peek().left);
                if(queue.peek().right!=null)queue.offer(queue.peek().right);
                sub_ls.add(queue.poll().val);
            }
            ls.add(sub_ls);
        }
        return ls;
    }      
}