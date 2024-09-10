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
class Solution {
    public int GCD(int a,int b){
          while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        if(head==null)return null;
        ListNode curr = head;
        while(curr != null && curr.next != null){
            int gcdvalue = GCD(curr.val,curr.next.val);
            ListNode ans = new ListNode(gcdvalue);
            ans.next = curr.next;
            curr.next = ans;
            curr = ans.next;
        }
        return head;
    }
}