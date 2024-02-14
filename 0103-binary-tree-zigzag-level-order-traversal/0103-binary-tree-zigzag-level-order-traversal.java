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
   
    public List<List<Integer>>zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ls=new ArrayList<>();
        if(root==null) return ls;

        Queue<TreeNode>q=new LinkedList<>();
        q.add(root);
        boolean lefttoright=true;
        int turn=0;
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer>sub=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode x=q.remove();
                sub.add(x.val);
                
                if(x.left!=null)  q.add(x.left);
                if(x.right!=null) q.add(x.right); 
            }
            if(turn%2!=0){
                Collections.reverse(sub);
            }
            turn++;
            ls.add(sub);
        }
        return ls;
    }
}