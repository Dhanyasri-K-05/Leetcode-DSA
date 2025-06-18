class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int m=nums.length/3;

        int[][] ans=new int[m][3];
        for(int i=0;i<m;i++){
            Arrays.fill(ans[i],-1);
        }

        Arrays.sort(nums);

int ind=-1;
        for(int i=0;i<nums.length;i++){

                   if(i%3==0){
                    ind++;
                    ans[ind][0]=nums[i];
                   }
                 else {
                    
                    if(nums[i]-ans[ind][0]<=k){
                    ans[ind][i%3]=nums[i];
                 }else{
                    return new int[0][0];
                 }
                 }
        }

    

        return ans;
        
    }
}