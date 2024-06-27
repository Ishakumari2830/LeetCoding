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
     private static class Counter {
        int count = 0;
    }

    private void inorder(TreeNode root, Counter cnt){
        if(root == null)return;
        cnt.count++;
        inorder(root.left,cnt);
        inorder(root.right,cnt);
    }
    public int countNodes(TreeNode root) {
        Counter cnt = new Counter();
        inorder(root,cnt);
        return cnt.count;
    }
}