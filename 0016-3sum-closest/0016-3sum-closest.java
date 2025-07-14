class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int mini=Integer.MAX_VALUE;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    int sum=nums[i]+nums[j]+nums[k];
                    int diff=Math.abs(target-sum);
                    if(diff<mini){
                        mini=diff;
                        ans=sum;
                        System.out.println(sum);
                    }
                }

            }
        }
        return ans;
    }
}