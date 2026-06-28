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
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        preorderHelper(root, ans);
        return ans;
    }

    public void preorderHelper(TreeNode root, List<Integer> ans) {
        if(root == null) {
            return;
        }
        ans.add(root.val);
        preorderHelper(root.left, ans);
        preorderHelper(root.right, ans);
    }
}