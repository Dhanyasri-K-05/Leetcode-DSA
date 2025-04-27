class Solution {
    public int countSubarrays(int[] nums) {
int count=0;
        for(int i=0;i<=nums.length-3;i++){
            int sum=0;
            int check=0;
            int c=0;
            for(int j=i;j<i+3;j++){
                c++;
                if(c==1 || c==3)sum=sum+nums[j];
                else{
                    check=nums[j];
                    
                }

             
            }
             if(sum*2==check) count++;
        }
        return count;
    }
}