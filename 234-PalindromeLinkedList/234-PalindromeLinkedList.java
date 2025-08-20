// Last updated: 8/20/2025, 10:06:49 PM
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
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null){
            slow = slow.next;
        }
        slow=reverseList(slow);
        fast=head;

        while( slow != null){
            if(fast.val != slow.val){
                return false;
            }

        fast=fast.next;
        slow=slow.next;
        }
        return true;
    }
    private ListNode reverseList(ListNode head){
        ListNode prev = null;
        while (head != null) {
            ListNode nextNode = head.next; // store next node
            head.next = prev;              // reverse pointer
            prev = head;                   // move prev forward
            head = nextNode;               // move head forward
        }
        return prev;
    }
}