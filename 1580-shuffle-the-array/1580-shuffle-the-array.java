class Solution {
    public int[] shuffle(int[] nums, int n) {
        int front=0;
        int mid=nums.length/2;
        int ans[]=new int[nums.length];

        for(int i=0;i<nums.length-1;i=i+2){
            ans[i]=nums[front];
            ans[i+1]=nums[mid];
            mid++;
            front++;
        }
        return ans;
    }
}