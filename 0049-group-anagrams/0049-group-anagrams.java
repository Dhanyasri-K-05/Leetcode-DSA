class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         List<List<String>>  ans=new ArrayList<>();
         HashMap<String,Integer> map=new HashMap<>();
int ind=0;
         for(String str:strs){
            char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String curr = new String(charArray);
           if(!map.containsKey(curr)){
            map.put(curr,ind);
            ind++;
           }
         }

        
        

         for(int i=0;i<map.size();i++){
            ans.add(new ArrayList<String>());
         }

         for(String str:strs){
             char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        String curr = new String(charArray);
        int index=map.get(curr);
        ans.get(index).add(str);

         }




return ans;

        
    }
}