class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int count1=0;
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }

         int maxValue = Collections.max(map.values());
        int maxKey = Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getKey();
         
        for(int i=0;i<nums.size();i++){
           if(nums.get(i)==maxKey) count1++;

           int count2=maxValue-count1;

            if(valid(count1,i+1) &&  valid(count2,nums.size()-(i+1))){
                return i;
            }  

        }

return -1;
        
    }

    boolean valid(int count,int len){
        return (count*2)>len;
    }
}