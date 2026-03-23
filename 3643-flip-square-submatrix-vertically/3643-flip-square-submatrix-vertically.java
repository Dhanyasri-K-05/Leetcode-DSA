class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int v=k;
        
        int swap=0;
        if(k%2==0){
            swap=k/2;
        }else{
            swap=(k-1)/2;
        }
        
        for(int i=x;i<(x+swap);i++){
            
            for (int j=y;j<y+k;j++){
                int temp=0;
                   
                temp=grid[i][j];
                grid[i][j]=grid[x+(v-1)][j];
                grid[x+(v-1)][j]=temp;
                System.out.print(grid[i][j]+" ");
                System.out.println(grid[i+(v-1)][j]);
                
            }
            v=v-1;

        }

        return grid;
    }
}