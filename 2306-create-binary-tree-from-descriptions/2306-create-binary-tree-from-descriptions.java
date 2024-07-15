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
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode> nodeMap = new HashMap<>();
        HashSet<Integer> children = new HashSet<>();
        for(int[] description : descriptions){
            int parentval = description[0];
            int childval = description[1];
            boolean isleft = description[2]==1;
            TreeNode parent = nodeMap.getOrDefault(parentval,new TreeNode(parentval));
            TreeNode child = nodeMap.getOrDefault(childval,new TreeNode(childval));
            if(isleft){parent.left=child;
            }
            else {parent.right = child;}

            nodeMap.put(parentval,parent);
            nodeMap.put(childval,child);
            children.add(childval);
        }
        TreeNode root = null;
        for(int key: nodeMap.keySet()){
            if(!children.contains(key)){
                root = nodeMap.get(key);
                break;


            }
        }
        return root;
    }
}