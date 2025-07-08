class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
  ArrayList<Integer> result=new ArrayList<>();
  if(edges.length==0){
    result.add(0);
    return result;
  }
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Integer>());

        } 
         Queue<Integer> q=new LinkedList<>();

        int[] degree=new int[n];
        for(int i=0;i<edges.length;i++){

            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
            degree[edges[i][1]]++;
            degree[edges[i][0]]++;
            
        }

        for(int i=0;i<degree.length;i++){
            if(degree[i]==1) q.add(i);
        }

       
        while(n>2){
            int size=q.size();
            n=n-size;

            for(int i=0;i<size;i++){
                int node=q.poll();
                for(int it:adj.get(node)){
                    degree[it]--;
                    if(degree[it]==1) q.add(it);
                }
            }
        }
      
      while(!q.isEmpty()){
        result.add(q.poll());
      }
     
        return result;
    }

 
}