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
    private TreeNode cnstrct(int preS,int preE,int postS,int[] preorder,int[] postorder){
        if(preS > preE)return null;
        if(preS == preE)return new TreeNode(preorder[preS]);
        int leftR = preorder[preS +1];
        int noOfNode = 1;
        while(postorder[postS + noOfNode- 1] != leftR){
            noOfNode++;
        }
        TreeNode node = new TreeNode(preorder[preS]);
        node.left = cnstrct(preS +1, preS + noOfNode,postS,preorder,postorder);
        node.right = cnstrct(preS +noOfNode + 1, preE , noOfNode+postS,preorder,postorder);

        return node;
    }
    public TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        int len = preorder.length;
        return cnstrct(0,len -1 , 0,preorder,postorder);
    }
}