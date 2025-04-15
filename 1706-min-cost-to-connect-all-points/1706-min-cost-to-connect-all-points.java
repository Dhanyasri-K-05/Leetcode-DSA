class Pair{
    int node;
    int weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}

class Solution {
    public int minCostConnectPoints(int[][] points) {
        int sum=0;
        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)-> a.weight-b.weight);

        ArrayList<Integer> adj=new ArrayList<>();

        for(int i=0;i<points.length;i++){
            adj.add(i);
        } 

        pq.add(new Pair(0,0));
        int vis[]=new int[points.length];

        while(!pq.isEmpty()){
            Pair curr=pq.poll();
            int n=curr.node;
            int w=curr.weight;

            if(vis[n]==1) continue;
            vis[n]=1;
            sum=sum+w;

            for(int it:adj){
                if(it!=n && vis[it]==0){
                    int dis=Math.abs(   Math.abs(points[n][0]-points[it][0]) +  Math.abs(points[n][1]-points[it][1])  );

                    pq.add(new Pair(it,dis));
                }
            }
        }  

        return sum;     
        
    }
}