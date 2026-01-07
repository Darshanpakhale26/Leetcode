// Problem 450: Delete Node in a BST

class Problem_450 {
    public TreeNode deleteNode(TreeNode root, int key) {
        if (root == null) {
            return null;
        }

        if (key < root.val) {
            root.left = deleteNode(root.left, key);
        } else if (key > root.val) {
            root.right = deleteNode(root.right, key);
        } else {
            // Node to be deleted found
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            } else {
                // Node with two children: Get the inorder successor (smallest in the right subtree)
                TreeNode successor = findMin(root.right);
                root.val = successor.val; // Copy the inorder successor's value to this node
                root.right = deleteNode(root.right, successor.val); // Delete the inorder successor
            }
        }
        return root;
    }

    private TreeNode findMin(TreeNode node) {
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
}