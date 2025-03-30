class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans=new ArrayList<>();
        int curr=-1;
        int ind=-1;
        int j=0;
        int total=0;

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            curr=s.lastIndexOf(ch);

            if(curr>=ind){
                ind=curr;
            }
           
            if(i==ind){
              
                    ans.add(i-total+1);
                     total=total+ans.get(j);
                    j++;
                }
            }
            
        
        return ans;
    }
}