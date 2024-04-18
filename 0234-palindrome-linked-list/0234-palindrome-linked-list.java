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
    public ListNode reverse(ListNode head){
        if(head == null || head.next == null)return head;
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;

    }
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)return true;
        //first step find middle
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head,sec = newHead;
        while(sec != null){
            if(first.val != sec.val){
                reverse(newHead);
                return false;
            }
            first = first.next;
            sec = sec.next;
        }
        reverse(newHead);
        return true;
    }
}