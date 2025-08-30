class Solution {
    TreeNode findSubtreeMin(TreeNode node) {
        while (node != null && node.left != null) {
            node = node.left;
        }
        return node;
    }

    TreeNode deleteNode(TreeNode node, int key) {
        if (node == null)
            return null;

        if (key < node.val)
            node.left = deleteNode(node.left, key);
        else if (key > node.val)
            node.right = deleteNode(node.right, key);
        else {
            // Case 1: Node has no children (leaf node)
            if (node.left == null && node.right == null) {
                return null;
            }
            // Case 2A: Node has only right child
            else if (node.left == null) {
                return node.right;
            }
            // Case 2B: Node has only left child
            else if (node.right == null) {
                return node.left;
            }
            // Case 3: Node has both children
            else {
                TreeNode successor = findSubtreeMin(node.right);
                node.val = successor.val;
                node.right = deleteNode(node.right, successor.val);
            }
        }
        return node;
    }
}