/*
 * @lc app=leetcode id=226 lang=java
 *
 * [226] Invert Binary Tree
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
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return root;

        TreeNode l = invertTree(root.left);
        TreeNode r = invertTree(root.right);

        root.left = r;
        root.right = l;

        return root;
    }
}

