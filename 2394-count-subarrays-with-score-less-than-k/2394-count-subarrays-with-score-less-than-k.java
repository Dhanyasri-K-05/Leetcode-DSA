class Solution {
    public long countSubarrays(int[] nums, long k) {

        int l=0;
        int r=0;
        long count=0;
        long sum=0;
        int total=0;

        while(l<nums.length && r<nums.length){

            sum=sum+nums[r];
        
           while (sum * (r - l + 1) >= k) {

                sum=sum-nums[l];
                l++;


            }
        
            count=count+r-l+1;
            r++;

        }
        return count;
    }
}