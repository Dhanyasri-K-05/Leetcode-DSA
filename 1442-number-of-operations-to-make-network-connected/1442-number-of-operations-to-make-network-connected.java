
class Disjoint{
    ArrayList<Integer> parent=new ArrayList<>();
    ArrayList<Integer> rank=new ArrayList<>();
   
      Disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
      }




      int find_parent(int u){

        if(u==parent.get(u)) return u;

             int up=find_parent(parent.get(u));
             parent.set(u,up);
             return up;
      }


      void union(int u,int v){
        int pu=find_parent(u);
        int pv=find_parent(v);

        if(pu==pv) return;
      if(rank.get(pu) <rank.get(pv)){
        parent.set(pu,pv);
      }
        else if(rank.get(pu) >rank.get(pv)){
        parent.set(pv,pu);
      }else{
     parent.set(pu,pv);
     rank.set(pv,rank.get(pv)+1);


      }



      }



}

class Solution {
    public int makeConnected(int n, int[][] connections) {
int extra=0;
int comcount=0;
        Disjoint dis=new Disjoint(n);

        for(int i=0;i<connections.length;i++){
            int u=connections[i][0];
            int v=connections[i][1];

            if(dis.find_parent(u)==dis.find_parent(v)) extra++;
            else{
                dis.union(u,v);
            }
        }

        for(int i=0;i<n;i++){
            if(dis.parent.get(i)==i) comcount++;
        }


        if(extra>=comcount-1) return comcount-1;
        return -1;
        
    }
}