class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length-3;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length-2;j++){
                 if(j>i+1 && nums[j]==nums[j-1]) continue;
                int k=j+1;
                int r=nums.length-1;
              

                while(k<r){
                     long total=(long)nums[i]+nums[k]+nums[j]+nums[r];
                    if(total==target){
                        ArrayList<Integer> ans=new ArrayList<>();
                        ans.addAll(Arrays.asList(nums[i],nums[j],nums[k],nums[r])); 
                        result.add(ans);
                        while(k<r && nums[k]==nums[k+1]) k++;
                         while(k<r && nums[r]==nums[r-1]) r--;
                         k++;
                         r--;
                    }else if(total<target){
                        k++;
                    }else r--;
                }
            }
        }

        return result;
        
    }
}