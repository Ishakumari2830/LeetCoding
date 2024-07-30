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
 class BSTiterator{
    public Stack<TreeNode> st = new Stack<TreeNode>();
    boolean reverse = true;
    public BSTiterator(TreeNode root,boolean isReverse){
        reverse = isReverse;
        pushAll(root);
    }
    public boolean hasNext(){
        return !st.isEmpty();
    }
    public int next(){
        TreeNode tmp = st.pop();
        if(reverse == false)pushAll(tmp.right);
        else pushAll(tmp.left);

        return tmp.val;
    }
    private void pushAll(TreeNode node){
        while(node != null){
            st.push(node);
            if(reverse== true)node = node.right;
            else node = node.left;
        }
    }
 }
class Solution {
    
    public boolean findTarget(TreeNode root, int k) {
        if(root== null)return false;
        BSTiterator l = new BSTiterator(root,false);
        BSTiterator r = new BSTiterator(root,true);
        int i = l.next();
        int j = r.next();//r.before
        while(i<j){
            if(i+j==k)return true;
            else if(i+j<k)i = l.next();
            else j = r.next();
        }
        return false;

        
    }
}