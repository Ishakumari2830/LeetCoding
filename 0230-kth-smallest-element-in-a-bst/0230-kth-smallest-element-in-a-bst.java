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
    public int kthSmallest(TreeNode root, int k) {
        int cnt = 0;
        Integer ksmall = null;
        TreeNode curr = root;
        while(curr != null){
            if(curr.left == null){
                cnt++;
                if(cnt == k) ksmall = curr.val;
                curr = curr.right;
            }
            else
            {
                TreeNode prev = curr.left;
                while(prev.right != null && prev.right != curr){
                    prev = prev.right;

                }
                if(prev.right == null){
                    prev.right = curr;
                    curr= curr.left;
                }
                else
                {
                    prev.right = null;
                    cnt++;
                    if(cnt == k)ksmall = curr.val;
                    curr = curr.right;
                }
            }

        }
        return ksmall;
        
    }
}