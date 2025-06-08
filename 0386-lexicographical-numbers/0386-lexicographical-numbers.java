class Solution {
    public List<Integer> lexicalOrder(int n) {
ArrayList<Integer>  result=new ArrayList<>();
        for(int i=1;i<=9;i++){
            dfs(i,n,result);
        }


        return result;
        
    }

    void dfs(int current, int n,ArrayList<Integer> result){

        if(current>n) return;

        result.add(current);

        for(int j=0;j<=9;j++){
            if((current*10+j)>n) return;
            dfs(current*10+j,n,result);
        }

    }
}