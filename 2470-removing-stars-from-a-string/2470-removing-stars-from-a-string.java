class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder();

        for(char ch:s.toCharArray()){
            st.push(ch);
        }

int count=0;
    while(!st.isEmpty()){
        char ele=st.pop();

         if(ele!='*' && count>0){
            count--;
        }
        else if(ele!='*' && count==0){
            sb.append(ele);
        }else if(ele=='*'){
            count++;
        }
    }

return sb.reverse().toString();
        
    }
}