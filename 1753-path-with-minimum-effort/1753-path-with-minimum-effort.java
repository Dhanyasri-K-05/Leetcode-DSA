class Pair{
    int i;
    int j;
    int effort;
    Pair(int i,int j,int effort){
        this.i=i;
        this.j=j;
        this.effort=effort;
    }
}
class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
 PriorityQueue<Pair> pq = new PriorityQueue<>((a, b) -> a.effort - b.effort);
pq.add(new Pair(0,0,0));
int[] row={-1,0,1,0};
int[] col={0,1,0,-1};

int[][] dis=new int[m][n];
for(int i=0;i<m;i++){
    Arrays.fill(dis[i],1000000009);
}
while(!pq.isEmpty()){
    Pair curr=pq.poll();
    int i=curr.i;
    int j=curr.j;
    int effort=curr.effort;

    if(i==m-1 && j==n-1) return effort;

    for(int d=0;d<4;d++){
        int newrow=i+row[d];
        int newcol=j+col[d];
        if(newrow>=0 && newrow<m && newcol>=0 && newcol<n){
        int diff=Math.max(effort,Math.abs(heights[i][j]-heights[newrow][newcol]));
        if(diff<dis[newrow][newcol]){
            dis[newrow][newcol]=diff;
            pq.add(new Pair(newrow,newcol,diff));
        }
        }

    }
}


 return 0;
    }
}