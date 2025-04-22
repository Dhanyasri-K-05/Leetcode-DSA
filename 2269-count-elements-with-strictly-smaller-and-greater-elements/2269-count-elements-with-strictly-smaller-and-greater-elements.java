class Solution {
    public int countElements(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
int count=0;
        for(int num:nums){
            list.add(num);
        }

        int max=Collections.max(list);
        int min=Collections.min(list);

        for(int i=0;i<nums.length;i++){

            if(nums[i]> min && nums[i]<max){
                count++;
            }

        }
        return count;
    }
}