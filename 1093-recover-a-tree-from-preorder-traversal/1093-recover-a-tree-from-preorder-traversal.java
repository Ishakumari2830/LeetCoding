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
    public TreeNode recoverFromPreorder(String traversal) {
        List<TreeNode> lvl = new ArrayList<>();
        int ind = 0,n = traversal.length();
        while(ind < n){
            int depth = 0;
            while( ind < n && traversal.charAt(ind)== '-'){
                depth++;
                ind ++;
            }
            int value = 0;
            while(ind < n && Character.isDigit(traversal.charAt(ind))){
                value = value *10 + (traversal.charAt(ind)-'0');
                ind++;
            }
            TreeNode node = new TreeNode(value);
            if(depth < lvl.size()){
                lvl.set(depth,node);

            }
            else {
                lvl.add(node);
            }
            if(depth > 0){
                TreeNode parent = lvl.get(depth -1);
                if(parent.left == null){
                    parent.left = node;
                } else{
                    parent.right = node;
                }
            }

        }
        return lvl.get(0);
    }
}