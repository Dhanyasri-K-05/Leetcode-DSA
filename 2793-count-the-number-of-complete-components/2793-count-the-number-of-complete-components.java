class Solution {
    public int countCompleteComponents(int n, int[][] edges) {


       ArrayList<ArrayList<Integer>> adj=new ArrayList<>();

       for(int i=0;i<n;i++){
        adj.add(new ArrayList<>());
       }

       for(int[] edge:edges){
        adj.get(edge[0]).add(edge[1]);
         adj.get(edge[1]).add(edge[0]);
       }


        int count=0;
        int vis[]=new int[n];

        for(int i=0;i<n;i++){
            if(vis[i]==0){
                ArrayList<Integer> list=new ArrayList<>();
                dfs(i,adj,vis,list);

                if(isComplete( list,adj)){
                    count++;
                }
            }
        }
        return count;
    }

    void dfs(int node,ArrayList<ArrayList<Integer>>adj,int[] vis,ArrayList<Integer> list){
        vis[node]=1;
        list.add(node);
        for(int it:adj.get(node)){
            if(vis[it]==0){
                vis[it]=1;
                dfs(it,adj,vis,list);
            }
        }
    }


    boolean isComplete(ArrayList<Integer> list,ArrayList<ArrayList<Integer>>adj){

         int size = list.size();
        for (int node :list) {
            if (adj.get(node).size() != size - 1) {
                return false;
            }
        }
        return true;

    }
}