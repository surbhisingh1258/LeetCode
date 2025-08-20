// Last updated: 8/20/2025, 10:08:00 PM
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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null; 
        
        ListNode prev=head;
        ListNode temp=prev.next;

        while(temp!=null){
            if(temp.val==prev.val){
                temp=temp.next;
                continue;
            }
            prev.next=temp;
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        return head;
        
    }
}