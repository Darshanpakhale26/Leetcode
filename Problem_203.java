// Problem 203  Remove Linked List Elements

class Problem_203 {
    public ListNode removeElements(ListNode head, int val) {
        // Create a dummy node to handle edge cases
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        while (current.next != null) {
            if (current.next.val == val) {
                // Remove the node by skipping it
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return dummy.next; // Return the new head
    }
}