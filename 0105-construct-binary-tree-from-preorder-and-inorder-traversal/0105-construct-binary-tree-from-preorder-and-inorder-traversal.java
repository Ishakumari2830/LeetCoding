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
    public TreeNode buildTree(int[] preorder,int prestrt,int preend,int[] inorder,int instrt,int inend,Map<Integer,Integer> mpp){
        if(prestrt > preend || instrt > inend)return null;
        TreeNode root = new TreeNode(preorder[prestrt]);
        int inroot = mpp.get(root.val);
        int numsleft = inroot-instrt;
        root.left = buildTree(preorder,prestrt+1,prestrt + numsleft,inorder,instrt,inroot-1,mpp);
        root.right = buildTree(preorder,prestrt+numsleft+1,preend,inorder,inroot+1,inend,mpp);
        return root;


    }
     
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        HashMap<Integer,Integer> mpp = new HashMap<>();
        for(int i =0;i<inorder.length;i++){
            mpp.put(inorder[i],i);
        }
        TreeNode root = buildTree(preorder,0,preorder.length-1,inorder,0,inorder.length-1,mpp);
        return root;
      

    }
}