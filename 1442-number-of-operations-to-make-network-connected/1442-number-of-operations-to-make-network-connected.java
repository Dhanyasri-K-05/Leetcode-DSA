class Disjoint{
    List<Integer> parent=new ArrayList<>();
     List<Integer> rank=new ArrayList<>();

     Disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
     }

     int findParent(int n){
        if(parent.get(n)==n) return n;

        int ulp=findParent(parent.get(n));
        parent.set(n,ulp);
        return parent.get(n);

     }


     void union(int u,int v){

        int ulp_u=findParent(u);
        int ulp_v=findParent(v);

        if(ulp_u==ulp_v) return;
        if(rank.get(ulp_u)<rank.get(ulp_v)){
            parent.set(ulp_u,ulp_v);
        }else if(rank.get(ulp_v)<rank.get(ulp_u)){
            parent.set(ulp_v,ulp_u);
        }else{
            parent.set(ulp_v,ulp_u);
            int curr=rank.get(ulp_u);
            rank.set(ulp_u,curr+1);
            
        }

     }
}


class Solution {
    public int makeConnected(int n, int[][] connections) {

        int extra=0;
        int comcount=0;

        Disjoint ds=new Disjoint(n);

        for(int i=0;i<connections.length;i++){
            int u=ds.findParent(connections[i][0]);
             int v=ds.findParent(connections[i][1]);

             if(u==v) extra++;
             else{
                ds.union(u,v);
             }

        }

        for(int i=0;i<n;i++){
            if(ds.parent.get(i)==i) comcount++;
        }

        if(extra>=comcount-1) return comcount-1;
        
        return -1;
        
    }
}