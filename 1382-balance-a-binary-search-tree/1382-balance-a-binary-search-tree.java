/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private void inorderTraversal(TreeNode node, List<Integer> nodes) {
        if (node == null) return;
        inorderTraversal(node.left, nodes);
        nodes.add(node.val);
        inorderTraversal(node.right, nodes);
    }

    // Function to convert sorted array to balanced BST
    private TreeNode sortedArrayToBST(List<Integer> nodes, int start, int end) {
        if (start > end) return null;
        int mid = start + (end - start) / 2;
        TreeNode node = new TreeNode(nodes.get(mid));
        node.left = sortedArrayToBST(nodes, start, mid - 1);
        node.right = sortedArrayToBST(nodes, mid + 1, end);
        return node;
    }

    // Main function to balance the BST
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> nodes = new ArrayList<>();
        inorderTraversal(root, nodes);
        return sortedArrayToBST(nodes, 0, nodes.size() - 1);
    }
}