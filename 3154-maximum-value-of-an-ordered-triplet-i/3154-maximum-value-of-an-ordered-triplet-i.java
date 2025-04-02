class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxi=0;

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                   long curr=(long)(nums[i]-nums[j])*nums[k];
                    maxi=Math.max(curr,maxi);

                }
            }
        }
        return maxi;
    }
}