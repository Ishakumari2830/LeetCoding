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
    public boolean flipEquiv(TreeNode root1, TreeNode root2) {
        TreeNode node1 = root1, node2 = root2;
        if(node1 == null && node2 == null) return true;
        if(node1 == null || node2 == null || node1.val != node2.val)return false;
        return (flipEquiv(node1.left,node2.left) || flipEquiv(node1.left,node2.right) )  && (flipEquiv(node1.right,node2.right) || flipEquiv(node1.right,node2.left));      
        
    }
}