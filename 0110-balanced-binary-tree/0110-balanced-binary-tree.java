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
    public boolean isBalanced(TreeNode root) {
        if(root==null) return true;

        return dfs(root)!=-1;



        
    }

  int dfs(TreeNode node){
        if(node==null) return 0;

        int left=dfs(node.left);
        if(left==-1) return -1;
        int right=dfs(node.right);
        if(right==-1) return -1;

        int diff=Math.abs(left-right);
        if(diff>1) return -1;
        return Math.max(left,right)+1;


    }
}