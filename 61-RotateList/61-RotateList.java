// Last updated: 8/20/2025, 10:08:07 PM
class Solution {
    public ListNode findNthNode(ListNode temp, int k) {
        int cnt = 1;
        while (temp != null) {
            if (cnt == k) return temp;
            cnt++;
            temp = temp.next;
        }
        return null; // Fix: Ensure a return statement exists
    }

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        // Step 1: Find the length of the list
        ListNode tail = head;
        int length = 1;
        while (tail.next != null) {
            tail = tail.next;
            length++;
        }

        // Step 2: Optimize k (if k is a multiple of length, no rotation needed)
        k = k % length;
        if (k == 0) return head;

        // Step 3: Make the list circular
        tail.next = head;

        // Step 4: Find the new last node (length - k)
        ListNode newLastNode = findNthNode(head, length - k);
        head = newLastNode.next;
        newLastNode.next = null; // Break the circular link

        return head;
    }
}