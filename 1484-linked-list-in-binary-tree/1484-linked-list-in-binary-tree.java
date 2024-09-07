/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    List<TreeNode> storingList = new ArrayList<>();
    public boolean isSubPath(ListNode head, TreeNode root) {
        storeToList(head,root);
        for(TreeNode e : storingList){
            if(checkSubPath(head,e))return true;

        }
        return false;
    }
    public void storeToList(ListNode head,TreeNode root){
        if(head==null || root == null)return ;
        if(head.val == root.val){
            storingList.add(root);
        }
        storeToList(head,root.left);
        storeToList(head,root.right);
    
    }
    public boolean checkSubPath(ListNode head,TreeNode root){
        if(head==null)return true;
        if(root==null)return false;
        if(head.val==root.val){
            return (checkSubPath(head.next,root.left) ||  (checkSubPath(head.next,root.right)));
        }
        return false;

    }
}