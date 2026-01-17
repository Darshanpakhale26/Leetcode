// Problem 2331: Evaluate Boolean Binary Tree

class Problem_2331 {
    public boolean evaluateTree(TreeNode root) {
        if (root == null) {
            return false;
        }
        // Leaf node
        if (root.left == null && root.right == null) {
            return root.val == 1;
        }
        boolean leftValue = evaluateTree(root.left);
        boolean rightValue = evaluateTree(root.right);
        if (root.val == 2) { // OR operation
            return leftValue || rightValue;
        } else { // AND operation
            return leftValue && rightValue;
        }
    }
}