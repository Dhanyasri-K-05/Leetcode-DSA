class Solution {
    public int minOperations(int[][] grid, int x) {
        int m=grid.length;
        int n=grid[0].length;
        int arr[]=new int[m*n];
        int rem=grid[0][0]%x;
        int index=0;
        int total=0;

        for(int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                arr[index]=grid[i][j];
                index++;
               
                if(grid[i][j]%x!=rem){
                    return -1;
                }
            }
        }

            Arrays.sort(arr);
            int mid=arr.length/2;
            for( int i=0;i<arr.length;i++){
                total=total+Math.abs(arr[mid]-arr[i])/x;

            }
            
        
        return total;
    }
}