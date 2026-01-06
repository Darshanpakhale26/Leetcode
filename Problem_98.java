// Problem 98: Validate Binary Search Tree

class Problem_98 {
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, null, null);
    }

    private boolean isValidBSTHelper(TreeNode node, Integer lower, Integer upper) {
        if (node == null) {
            return true;
        }

        int val = node.val;
        if (lower != null && val <= lower) {
            return false;
        }
        if (upper != null && val >= upper) {
            return false;
        }

        if (!isValidBSTHelper(node.right, val, upper)) {
            return false;
        }
        if (!isValidBSTHelper(node.left, lower, val)) {
            return false;
        }
        return true;
    }
}


// Another approach using in-order traversal

class Problem_98_InOrder {
    private Integer prev = null;

    public boolean isValidBST(TreeNode root) {
        return inOrderTraversal(root);
    }

    private boolean inOrderTraversal(TreeNode node) {
        if (node == null) {
            return true;
        }

        if (!inOrderTraversal(node.left)) {
            return false;
        }

        if (prev != null && node.val <= prev) {
            return false;
        }
        prev = node.val;

        return inOrderTraversal(node.right);
    }
}