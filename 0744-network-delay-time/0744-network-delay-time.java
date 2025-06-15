class Pair{
    int node;
    int weight;
    Pair(int node,int weight){
        this.node=node;
        this.weight=weight;
    }
}

class Pair2{
    int dist;
    int vert;

    Pair2(int dist,int vert){
        this.dist=dist;
        this.vert=vert;
    }
}


class Solution {
    public int networkDelayTime(int[][] times, int n, int k) {

        ArrayList<ArrayList<Pair>> adj=new ArrayList<>();

        for(int i=0;i<n;i++){
            adj.add(new ArrayList<Pair>());
        }

        for(int i=0;i<times.length;i++){
            adj.get(times[i][0]-1).add(new Pair(times[i][1]-1,times[i][2]));
        }

        PriorityQueue<Pair2> pq=new PriorityQueue<>((a,b)->a.dist-b.dist);

        int dis[]=new int[n];
        Arrays.fill(dis,1000000009);

        pq.add(new Pair2(0,k-1));
        dis[k-1]=0;

        while(!pq.isEmpty()){
            Pair2 curr=pq.poll();
            int distance=curr.dist;
            int nodes=curr.vert;

            for(Pair it:adj.get(nodes)){
                int ni=it.node;
                int w=it.weight;

                if(dis[ni]> w+distance){
                    dis[ni]=w+distance;
                    pq.add(new Pair2(dis[ni],ni));
                }
            }
        }

        for(int i=0;i<n;i++){
            if(dis[i]==1000000009) dis[i]=-1;
        }
int maxi=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(dis[i]==-1) return -1;
            maxi=Math.max(dis[i],maxi);
        }
return maxi;


        
    }
}