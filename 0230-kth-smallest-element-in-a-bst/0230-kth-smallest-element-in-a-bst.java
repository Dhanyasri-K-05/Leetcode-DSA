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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        if(root==null) return 0;

        dfs(root,pq);

        while(!pq.isEmpty() && k>1){
            pq.poll();
            k--;

        }

        return pq.peek();
        
    }

    void dfs(TreeNode node,PriorityQueue<Integer> pq){
        if(node==null) return;

        pq.add(node.val);

        dfs(node.left,pq);
        dfs(node.right,pq);
    }
}