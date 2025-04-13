class Solution {
    public boolean canFinish(int num, int[][] pre) {

        ArrayList<ArrayList<Integer>> adj =new ArrayList<>();
        for(int i=0;i<num;i++){
            adj.add(new ArrayList<Integer>());
        }

        for(int i=0;i<pre.length;i++){
            adj.get(pre[i][1]).add(pre[i][0]);
        }
        
        int[] vis=new int[num];
        int[] pathvis=new int[num];

        for(int i=0;i<num;i++){
            if(vis[i]==0){
                if(dfs(i,vis,adj,pathvis)==true){
                    return false;
                }
            }
        }

        return true ;
        
    }

  boolean dfs(int node, int[] vis, ArrayList<ArrayList<Integer>> adj,int[] pathvis ){
           vis[node]=1;
           pathvis[node]=1;

        for(int it:adj.get(node)){
            if(vis[it]==0){
                if(dfs(it,vis,adj,pathvis)==true) return true;
            }else{
                if(pathvis[it]==1) return true;
            }
        }

        pathvis[node]=0;
        return false;
  }



}