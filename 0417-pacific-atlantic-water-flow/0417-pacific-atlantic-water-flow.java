class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] height) {
      int m=height.length;
      int n=height[0].length;
        boolean[][] at=new boolean[m][n];
          boolean[][] pasi=new boolean[m][n];
         int[] row={-1,0,1,0};
        int col[]={0,1,0,-1};

        
            for(int j=0;j<n;j++){
                 at[0][j]=true;
                    dfs(0,j,height,row,col,m,n,at);
                
            }

            for(int i=0;i<m;i++){
                  at[i][0]=true;
                    dfs(i,0,height,row,col,m,n,at);

            }




             for(int j=0;j<n;j++){
                pasi[m-1][j]=true;
                
                    dfs(m-1,j,height,row,col,m,n,pasi);
                
            }

            for(int i=0;i<m;i++){
                  pasi[i][n-1]=true;
                
                
                    dfs(i,n-1,height,row,col,m,n,pasi);

            }

            List<List<Integer>> ans=new ArrayList<>();

            for(int i=0;i<m;i++){
                for(int j=0;j<n;j++){
                    if(at[i][j]==true && pasi[i][j]==true){
                        ArrayList<Integer> curr=new ArrayList<>();
                        curr.add(i);
                        curr.add(j);

                        ans.add(curr);
                    }
                }
            }
        
return ans;
       
        
    }

   void dfs(int i,int j,int[][] height,int[] row,int[] col,int m,int n,boolean[][] ocean){
       
        for(int k=0;k<4;k++){
          int newrow=i+row[k];
          int newcol=j+col[k];

          if(newrow>=0 && newrow<m && newcol>=0 && newcol<n && !ocean[newrow][newcol] &&
          height[newrow][newcol]>=height[i][j]){
            
                ocean[newrow][newcol]=true;
            dfs(newrow,newcol,height,row,col,m,n,ocean);
           
          }




    



        }






    }
}