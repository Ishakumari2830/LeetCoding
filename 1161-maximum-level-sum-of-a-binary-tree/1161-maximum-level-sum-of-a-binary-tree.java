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
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        int lvl = 1;
        int ans = 1;
        q.offer(root);
        int maxSum = Integer.MIN_VALUE;

        while(!q.isEmpty()){
            int len = q.size();
            int currSum = 0;
            for(int i = 0;i<len;i++){
                TreeNode node = q.poll();
                currSum += node.val;
                if(node.left != null)q.offer(node.left);
                if(node.right != null)q.offer(node.right);
            } 
            if(currSum > maxSum){
                maxSum = currSum;
                ans = lvl;
            }
            lvl++;
        }
        return ans;
    }
}