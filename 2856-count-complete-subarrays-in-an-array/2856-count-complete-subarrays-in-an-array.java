class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
HashMap<Integer,Integer> map=new HashMap<>();
        int value=set.size();
int count=0;
int l=0;
int r=0;
        while(l<nums.length && r<nums.length){
            map.put(nums[r],map.getOrDefault(nums[r],0)+1);
            while(map.size()==value) {
                count=count+nums.length-r;
                map.put(nums[l],map.get(nums[l])-1);
                if(map.get(nums[l])==0) map.remove(nums[l]);
                l++;
             }
             
                r++;
             
           

        }
        return count;
    }
}