class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {

        List<List<Integer>> graph=new ArrayList<>();
        int[] vis=new int[n];

         for(int i=0;i<n;i++){
            graph.add(new ArrayList<>());
          
        }

        for(int i=0;i<edges.length;i++){
            graph.get(edges[i][0]).add(edges[i][1]);
            graph.get(edges[i][1]).add(edges[i][0]);
          
        }


        return dfs(source,graph,destination,vis);
        
    }

    boolean dfs(int node,List<List<Integer>> graph,int destination,int[] vis){
        vis[node]=1;
        if(node==destination) return true;
        

        for(int curr:graph.get(node)){
            if(vis[curr]!=1){
            if(dfs(curr,graph,destination,vis)) return true;
            }
        }

        return false;
    }
}