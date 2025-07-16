class Solution {
    public int findUnsortedSubarray(int[] nums) {

        int count = 0;

        int l = -1;
        int r = -1;
        int maxi=Integer.MIN_VALUE;
        int mini=Integer.MAX_VALUE;

        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] <maxi) {
                l = i;
            }else{
                maxi=nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] >mini) {
                
               r=i;
            } else{
                mini=nums[i];
            }
        }

        if (l != -1 && r != -1)
            count = l-r + 1;
        else {
            return 0;
        }

        return count;

    }
}