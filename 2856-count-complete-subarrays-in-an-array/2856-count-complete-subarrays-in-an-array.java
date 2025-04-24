class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);
        }

        int value=set.size();
int count=0;

for(int i=0;i<nums.length;i++){
    HashMap<Integer,Integer> map=new HashMap<>();
    for(int j=i;j<nums.length;j++){
        map.put(nums[j],map.getOrDefault(nums[j],0)+1);
        if(map.size()==value)count++;

    }
    //map.put(nums[i],map.get(nums[i])-1);
}       
        return count;
    }
}