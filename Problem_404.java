// Problem 404: Sum of Left Leaves

class Problem_404 {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumLeftLeavesHelper(root, false);
    }

    private int sumLeftLeavesHelper(TreeNode node, boolean isLeft) {
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            return isLeft ? node.val : 0;
        }
        return sumLeftLeavesHelper(node.left, true) + sumLeftLeavesHelper(node.right, false);
    }
}