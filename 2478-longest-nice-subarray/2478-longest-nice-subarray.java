class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0;
        int maxi=1;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            while((sum & nums[i])!=0){
                sum=sum^nums[l];
                l++;

            }
                sum=sum|nums[i];
                int len=i-l+1;
                maxi=Math.max(maxi,len);
            

        }
        return maxi;
    }
}