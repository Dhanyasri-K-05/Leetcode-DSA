class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums){
            set.add(num);

        }
   int maxi=0;

        int[] ans=new int[set.size()];
int ind=0;
        for(int num:set){
            ans[ind]=num;
            ind++;
        }
        
        Arrays.sort(ans);
int count=1;
        for(int i=0;i<ans.length-1;i++){
            if(ans[i]+1==ans[i+1]){
                count++;
                System.out.println(count);
            }else{
                maxi=Math.max(count,maxi);
                count=1;
            }
        }
        if (maxi==0){
            return count;

        }else{
            return maxi>count?maxi:count;
        }
    }
}