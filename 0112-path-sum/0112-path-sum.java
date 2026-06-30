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

    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root == null)
            return false;

        return helper(root, targetSum, 0);
    }

    public boolean helper(TreeNode root, int target, int sum) {

        if(root == null)
            return false;

        // Current node contributes its own value
        sum += root.val;

        // If we're at a leaf, decide here
        if(root.left == null && root.right == null) {
            return sum == target;
        }

        return helper(root.left, target, sum)
            || helper(root.right, target, sum);
    }
}