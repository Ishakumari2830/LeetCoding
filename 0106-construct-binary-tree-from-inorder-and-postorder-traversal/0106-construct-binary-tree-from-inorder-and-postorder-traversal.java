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
  public TreeNode buildTree( int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> mpp) {
        if (postStart > postEnd || inStart > inEnd) return null;

        TreeNode root = new TreeNode(postorder[postEnd]);
        int inRoot = mpp.get(root.val);
        int numsLeft = inRoot - inStart;

        root.left = buildTree(inorder, inStart, inRoot - 1,postorder, postStart, postStart + numsLeft - 1, mpp);
        root.right = buildTree(inorder, inRoot + 1, inEnd,postorder, postStart + numsLeft, postEnd - 1,mpp);

        return root;
    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder==null || postorder==null || inorder.length != postorder.length)return null;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < inorder.length; i++) {
            mpp.put(inorder[i], i);
        }
        return buildTree(inorder, 0, inorder.length - 1,postorder, 0, postorder.length - 1,  mpp);

    }
}