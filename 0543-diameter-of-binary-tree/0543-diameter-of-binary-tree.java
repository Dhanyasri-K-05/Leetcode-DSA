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
    public int diameterOfBinaryTree(TreeNode root) {

        if(root==null) return 0;
        int[] maxi={-1};
        dfs(root,maxi);
        return maxi[0];



        
    }

    int dfs(TreeNode node,int[] maxi){
        if(node==null) return 0;

        int left=dfs(node.left,maxi);
        int right=dfs(node.right,maxi);
        maxi[0]=Math.max(maxi[0],left+right);

        return Math.max(left,right)+1;
    }
}