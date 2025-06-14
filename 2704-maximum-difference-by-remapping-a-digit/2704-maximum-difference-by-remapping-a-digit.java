class Solution {
    public int minMaxDifference(int num) {

        ArrayList<Integer> ans=digi(num);
        Collections.reverse(ans);

        int digits=ans.size();
int target1=-1;
int target2=-1;
        for(int i=0;i<digits;i++){
            if(ans.get(i)!=9){
                target1=ans.get(i);
                // System.out.println(ans.get(i));
                break;
            }
        }

          for(int i=0;i<digits;i++){
            if(ans.get(i)!=0){
                target2=ans.get(i);
                // System.out.println(ans.get(i));
                break;
            }
        }

        int maxi=0;
        int mini=0;

        for(int i=0;i<digits;i++){
          // System.out.println(ans.get(i));
            if(ans.get(i)==target1){
                maxi=maxi*10+9;
                
            }else{
                maxi=maxi*10+ans.get(i);
                
            }
        }

          for(int i=0;i<digits;i++){
          // System.out.println(ans.get(i));
            if(ans.get(i)==target2){
            
                mini=mini*10+0;
            }else{
            
                mini=mini*10+ans.get(i);
            }
        }



     

      

        
return maxi-mini;
 
         

        
    }


    ArrayList<Integer> digi(int num){
        ArrayList<Integer> list=new ArrayList<>();
        int n=num;
        while(n>0){
        
          int   digit=n%10;
          list.add(digit);
            n=n/10;
        }

        return list;
    }
}