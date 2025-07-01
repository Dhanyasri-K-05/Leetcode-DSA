class Solution {
    public int possibleStringCount(String word) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)==word.charAt(i-1)){
                 char ch=word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1); 
            }
        }

int c=0;
        for(int num:map.values()){
            if(num>=1){
                c=c+num;
            }
        }
        return c+1;
    }
}