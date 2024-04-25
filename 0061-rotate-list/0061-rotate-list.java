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
    ListNode findNNode(ListNode temp,int k){
        int cnt = 1;
        while(temp != null){
        if(cnt == k) return temp;
            cnt++;
           temp = temp.next;
            
        }
        return temp;
    }
    public ListNode rotateRight(ListNode head, int k) { 
        if(head == null || k== 0) return head;
        int len = 1;
       // int cnt = 1;
        ListNode tail = head;
        while(tail.next != null){
            len += 1;
            tail = tail.next;
        
        }
        if(k% len == 0)return head;
        k = k%len;
        tail.next = head;
        ListNode newTailNode =  findNNode(head,len-k);
        head = newTailNode.next;
        newTailNode.next = null;
        return head;
    }
}