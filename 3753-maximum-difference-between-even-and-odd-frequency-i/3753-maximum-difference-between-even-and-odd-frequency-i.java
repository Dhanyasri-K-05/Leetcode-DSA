class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
    
    int maxodd=0;
    int mineven=Integer.MAX_VALUE;
    int diff=Integer.MIN_VALUE;
        for(int val:map.values()){

            if(val%2!=0 && val>maxodd) maxodd=val;
           else  if( val%2==0 && val<mineven) mineven=val;
           

               
        }
System.out.println(maxodd);
System.out.println(mineven);

          diff=Math.max(maxodd-mineven,diff);


        return diff;
        
    }
}