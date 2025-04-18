class Solution {
    public String countAndSay(int n) {
           return f(n);        
    }

String f(int n){
    if(n==1) return "1";

     String ans=f(n-1);

     return create(ans);

}


String create(String str){
    int count=1;
    ArrayList<int[]> list=new ArrayList<>();
    for(int i=0;i<str.length()-1;i++){
        if(str.charAt(i)==str.charAt(i+1)){
            count++;
        }else{
            list.add(new int[]{count,str.charAt(i)});
            count=1;
        }
    }
       list.add(new int[]{count,str.charAt(str.length() - 1)});



       StringBuilder st=new StringBuilder();

       for(int i=0;i<list.size();i++){
        int[] arr=list.get(i);
        st.append(arr[0]);
        st.append((char)arr[1]);
       }
        System.out.println(st.toString());
       return st.toString();
}


}