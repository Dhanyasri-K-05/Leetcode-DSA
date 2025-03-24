class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int close=Integer.MAX_VALUE;
        int sum=-1;


        for(int i=0;i<nums.length-2;i++){

              if (i > 0 && nums[i] == nums[i - 1]) continue; 
            int j=i+1;
            int k=nums.length-1;

            while(j<k){
                int total=nums[i]+nums[j]+nums[k];
                int diff=Math.abs(target-total);
                if(total>target){
                    k--;
                }else if(total<target){
                    j++;
                }
                
                if(target==total){
                   return total;
                }
             
                if(diff<close){
                    close=diff;
                    sum=total;
                }
            


            }
        }
        return sum;
    }
}