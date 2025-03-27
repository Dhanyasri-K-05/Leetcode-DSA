class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {

        int[] ind=new int[n];
        List<Integer> ans= new ArrayList<>();

        for(List<Integer> list:edges){
            ind[list.get(1)]++;
        }

        for(int i=0;i<n;i++){
            if(ind[i]==0){
                ans.add(i);
            }
        }
        return ans;
    }
}