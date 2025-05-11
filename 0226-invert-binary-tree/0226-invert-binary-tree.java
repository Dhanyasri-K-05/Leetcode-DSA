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
    public TreeNode invertTree(TreeNode root) {
if(root==null) return null;
        dfs(root);
        return root;
        
    }

   void dfs(TreeNode node){
        if(node==null) return ;

        dfs(node.left);
        dfs(node.right);

        TreeNode temp=node.right;
        node.right=node.left;
        node.left=temp;
    }
}