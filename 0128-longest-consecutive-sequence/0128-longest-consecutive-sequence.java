class Solution {
    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new HashSet<>();

        for(int num:nums){
            set.add(num);
          }


    int[] ans=new int[set.size()];
int i=0;
    for(int num:set){
        ans[i]=num;
      
        i++;
    }
Arrays.sort(ans);

int count=1;
int maxi=-1;
if(ans.length==1 || ans.length==0) return ans.length;

    for(int j=1;j<ans.length;j++){
        if(ans[j]==ans[j-1]+1) {count++;}
        
        else{
            maxi=Math.max(maxi,count);
            count=1;

        }
  maxi=Math.max(maxi,count);

    }
    return maxi;


    }
}