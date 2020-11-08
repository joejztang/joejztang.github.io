/*
 * @lc app=leetcode id=94 lang=java
 *
 * [94] Binary Tree Inorder Traversal
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        traverse(res, root);
        return res;
    }

    private void traverse(List<Integer> res, TreeNode root) {
        if (root == null) return;
        traverse(res, root.left);
        res.add(root.val);
        traverse(res, root.right);
    }
}

