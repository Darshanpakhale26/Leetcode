// 109 Convert Sorted List to Binary Search Tree

class Problem_109 {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        return convertListToBST(head, null);
    }

    private TreeNode convertListToBST(ListNode head, ListNode tail) {
        if (head == tail) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Find the middle element of the linked list
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }

        TreeNode root = new TreeNode(slow.val);
        root.left = convertListToBST(head, slow);
        root.right = convertListToBST(slow.next, tail);

        return root;
    }
}


