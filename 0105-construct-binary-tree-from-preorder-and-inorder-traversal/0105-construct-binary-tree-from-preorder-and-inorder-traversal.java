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
    // tc O(n)
    // sc O(n)
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            hm.put(inorder[i],i);
        }
        TreeNode ans=splitTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,hm);
        return ans;
    }

    public static TreeNode splitTree(int[] preorder,int ps,int pe,int[] inorder,int is,int ie,HashMap<Integer,Integer>hm){
        if(ps>pe || is>ie){
            return null;
        }
        TreeNode root=new TreeNode(preorder[ps]);
        int inRootIdx=hm.get(preorder[ps]);
        int numsleft=hm.get(preorder[ps]) - is; //no. of elements in left of inorder [preorder[ps]]

        //recursive calls for left and right subtrees
        root.left=splitTree(preorder,ps+1,ps+numsleft,inorder,is,inRootIdx-1,hm);
        root.right=splitTree(preorder,ps+numsleft+1,pe,inorder,inRootIdx+1,ie,hm);

        return root;
    }
}