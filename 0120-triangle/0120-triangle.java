class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();
        int[][] dp=new int[m+1][m+1];
        for(int i=0;i<m;i++){
            Arrays.fill(dp[i],-1);
        }

        return f(0,0,triangle,dp);

        
    }

    int f(int i,int j,List<List<Integer>> triangle,int[][] dp){
        if(i>=triangle.size()) return Integer.MAX_VALUE;
        if(i==triangle.size()-1) return triangle.get(i).get(j);
if(dp[i][j]!=-1) return dp[i][j];

        int down=f(i+1,j,triangle,dp);
        int right=f(i+1,j+1,triangle,dp);

        return dp[i][j]=triangle.get(i).get(j)+Math.min(down,right);
    }
}