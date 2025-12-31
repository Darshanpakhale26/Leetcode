// 206 Reverse Linked List

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
class Problem_206 {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next; // Store next node
            current.next = prev;               // Reverse the link
            prev = current;                    // Move prev to current
            current = nextTemp;                // Move to next node
        }
        
        return prev; // New head of the reversed list
    }
}