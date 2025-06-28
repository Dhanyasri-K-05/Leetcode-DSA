class Disjoint {
    ArrayList<Integer> parent = new ArrayList<>();
    ArrayList<Integer> rank = new ArrayList<>();

    Disjoint(int n) {
        for (int i = 0; i < n; i++) {
            parent.add(i);
            rank.add(0);
        }
    }

    int find_parent(int u) {

        if (u == parent.get(u))
            return u;

        int up = find_parent(parent.get(u));
        parent.set(u, up);
        return up;
    }

    void union(int u, int v) {
        int pu = find_parent(u);
        int pv = find_parent(v);

        if (pu == pv)
            return;
        if (rank.get(pu) < rank.get(pv)) {
            parent.set(pu, pv);
        } else if (rank.get(pu) > rank.get(pv)) {
            parent.set(pv, pu);
        } else {
            parent.set(pu, pv);
            rank.set(pv, rank.get(pv) + 1);

        }

    }

}


class Solution {
    public int removeStones(int[][] stones) {

      int total_row=0;
      int total_col=0;

      for(int i=0;i<stones.length;i++){
        total_row=Math.max(total_row,stones[i][0]);
         total_col=Math.max(total_col,stones[i][1]);
      }

      Disjoint dis=new Disjoint(total_row+1+total_col+1);
      


      for(int i=0;i<stones.length;i++){
        int u=stones[i][0];
        int v=total_row+1+stones[i][1];

        dis.union(u,v);
      }
Set<Integer> uniqueParents = new HashSet<>();
for (int i = 0; i < stones.length; i++) {
    int u = stones[i][0];
    int v = total_row + 1 + stones[i][1];
    
    uniqueParents.add(dis.find_parent(u));
    uniqueParents.add(dis.find_parent(v));
}
return stones.length - uniqueParents.size();


        
    }
}