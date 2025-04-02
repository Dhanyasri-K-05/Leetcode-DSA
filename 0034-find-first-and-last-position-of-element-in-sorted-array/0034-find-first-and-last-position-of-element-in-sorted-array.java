class Solution {
    public int[] searchRange(int[] nums, int target) {

        int[] ans=new int[2];
        int first=firstfind(nums,target);
        int last=lastfind(nums,target);
        ans[0]=first;

        ans[1]=last;
        return ans;

        
    }
  int firstfind(int[] nums, int target){
    int first=-1;
           int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                first=mid;
                high=mid-1;
            }

        else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return first;
  }



 int lastfind(int[] nums, int target){
    int last=-1;
           int low=0;
        int high=nums.length-1;

        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                last=mid;
                low=mid+1;
            }

        else if(nums[mid]>target){
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return last;
  }








}