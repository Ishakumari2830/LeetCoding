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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null)return ans;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        boolean flag = true;
        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> row = new ArrayList<>();
            for(int i =0;i<size;i++){
                root = q.poll();
                if (flag) {
                    row.addLast(root.val);
                } else {
                    row.addFirst(root.val);
                }
                if(root.left != null)q.add(root.left);
                if(root.right != null)q.add(root.right);
                
            }
            flag = !flag;
            ans.add(row);
            
        
        }
        return ans;
    }
}