class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
int V=graph.length;
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<Integer>());
        }


     for(int i=0;i<V;i++){
        for(int j=0;j<graph[i].length;j++){
            adj.get(i).add(graph[i][j]);
        }
     }

          ArrayList<Integer> ans=new ArrayList<>();
             int[] vis=new int[V];
             int[] pathvis=new int[V];

        for(int i=0;i<V;i++){
            if(vis[i]==0){
               if( dfs(i,vis,pathvis,ans,adj)==true) {
                  
               }
            }
        }
        
        Collections.sort(ans);
        return ans;
    }
    
    boolean dfs(int node,int[] vis,int[] pathvis,ArrayList<Integer>ans, ArrayList<ArrayList<Integer>> adj){
        vis[node]=1;
        pathvis[node]=1;
        
        for(int it:adj.get(node)){
            if(vis[it]==0){
               if( dfs(it,vis,pathvis,ans,adj)==true){
                   return true;
               }
                
            }
            
            else{
                
                if(pathvis[it]==1) return true;
            }
        }
        
        pathvis[node]=0;
        ans.add(node);
        return false;
    
    
    
    
    
}



}






        
    