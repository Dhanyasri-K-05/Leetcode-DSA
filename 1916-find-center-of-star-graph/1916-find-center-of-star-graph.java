class Solution {
    public int findCenter(int[][] edges) {
        
        HashSet<Integer> set=new HashSet<>();

        for(int i=0;i<edges.length;i++){
            set.add(edges[i][0]);
            set.add(edges[i][1]);

        }
        int[] ind=new int[set.size()+1];


        for(int i=0;i<edges.length;i++){
            ind[edges[i][0]]++;
            ind[edges[i][1]]++;
        }



     int maxi=ind[1];
        for(int i=1;i<ind.length;i++){
            if(ind[i]>maxi){
                return i;
            }
        }

        return 1;
    }
}