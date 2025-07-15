class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
int l=0;
int prod=1;
int count=0;
if (k <= 1) return 0;
        for(int r=0;r<nums.length;r++){

            prod=nums[r]*prod;
             
             while(prod>=k && l<nums.length){
                prod=prod/nums[l];
               
                l++;
             }

               count=count+(r-l+1);
        }

        return count;
        
    }
}