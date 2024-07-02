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
    //  private static class Counter {//use of wrapper class since in java passes arg by value
    //     int count = 0;
    // }

    //private void inorder(TreeNode root, Counter cnt){
    //     if(root == null)return;
    //     cnt.count++;
    //     inorder(root.left,cnt);
    //     inorder(root.right,cnt);
    // }
     public int countNodes(TreeNode root) {
    //     Counter cnt = new Counter();
    //     inorder(root,cnt);
    //     return cnt.count;

    //more optimised one , we know total node = 2^h - 1
    if(root==null)return 0;
    int left = getHeightOfLeft(root);
    int right = getHeightOfRight(root);
    if(left==right )return ((2<<(left))-1);
    else return countNodes(root.left)+countNodes(root.right) + 1;



    }
    public int getHeightOfLeft(TreeNode root){
        int count = 0;
        while(root.left != null){
            count ++;
            root = root.left;
        }
        return count;
    }
    public int getHeightOfRight(TreeNode root){
        int cnt =0;
        while(root.right!=null){
            cnt++;
            root = root.right;
        }
        return cnt;
    }
}