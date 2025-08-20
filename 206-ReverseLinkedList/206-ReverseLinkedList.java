// Last updated: 8/20/2025, 10:07:07 PM
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
    public ListNode reverseList(ListNode head) {
        ListNode node = null;
        while(head !=null)
        {
            ListNode temp = head.next;
            head.next=node;
            node = head;
            head = temp;
            
        }
        return node;
    }
}