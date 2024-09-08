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
    public ListNode[] splitListToParts(ListNode head, int k) {
          ListNode[] parts = new ListNode[k]; // Initialize array to hold k parts
        
        // Calculate the length of the linked list
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        
        // Determine size of each part
        int n = len / k, r = len % k;
        temp = head;
        ListNode prev = null;
        
        // Split the list
        for (int i = 0; temp != null && i < k; i++, r--) {
            parts[i] = temp;  // Start of the current part
            for (int j = 0; j < n + (r > 0 ? 1 : 0); j++) { // Extra node if r > 0
                prev = temp;
                temp = temp.next;
            }
            // Break the current part from the rest of the list
            if (prev != null) {
                prev.next = null;
            }
        }
        return parts;   
    }
}