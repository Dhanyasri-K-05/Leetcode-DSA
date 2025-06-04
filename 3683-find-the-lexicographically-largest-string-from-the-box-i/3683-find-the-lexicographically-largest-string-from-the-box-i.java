class Solution {
    public String answerString(String word, int numFriends) {

        if(numFriends==1) return word;
        String result="";
        int n=word.length();
        int len=n-numFriends+1;
        char maxchar='a';

        for(char ch:word.toCharArray()){
            if(ch>maxchar) maxchar=ch;
        }


        for(int i=0;i<word.length();i++){
            if(word.charAt(i)==maxchar){
                if(i+len<=n){
                    String sub=word.substring(i,i+len);
                    if(sub.compareTo(result)>0) result=sub;
                }
                else{
                    String sub=word.substring(i);
                    if(sub.compareTo(result)>0) result=sub;
                }
            }

        
        }
        return result;
    }
}