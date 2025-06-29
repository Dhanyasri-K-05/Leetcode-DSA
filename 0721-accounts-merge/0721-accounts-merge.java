class Disjoint{
    ArrayList<Integer> rank=new ArrayList<>();
     ArrayList<Integer> parent=new ArrayList<>();

     Disjoint(int n){
        for(int i=0;i<n;i++){
            parent.add(i);
            rank.add(0);
        }
     }

   int find_parent(int u){
    if(u==parent.get(u)) return u;
     int up=find_parent(parent.get(u));
    parent.set(u,up);
    return up;


   }

   void union(int u,int v){
    int pu=find_parent(u);
    int pv=find_parent(v);
    if(pu==pv) return;

    if(rank.get(pu)<rank.get(pv)){

        parent.set(pu,pv);

    }else if (rank.get(pu)>rank.get(pv)){
        parent.set(pv,pu);


    }else{

      parent.set(pv,pu);
      int c=rank.get(pu);
      rank.set(pu,c+1);

    }





   }

     
}


class Solution {
    public List<List<String>> accountsMerge(List<List<String>> accounts) {

       int n=accounts.size();
        Disjoint dis=new Disjoint(n);

        HashMap<String,Integer> map=new HashMap<>();

        for(int i=0;i<accounts.size();i++){
            for(int j=1;j<accounts.get(i).size();j++){
               if(!map.containsKey(accounts.get(i).get(j))){
                map.put(accounts.get(i).get(j),i);
               }else{
                   int u=map.get(accounts.get(i).get(j));
                   int v=i;
                   dis.union(u,v);

               }
            }
        } 




List<List<String>> result=new ArrayList<>();

HashMap<Integer,ArrayList<String>> email=new HashMap<>();
for(Map.Entry<String,Integer> entry:map.entrySet()){


        int num=dis.find_parent(entry.getValue());
        String val=entry.getKey();
   if (!email.containsKey(num)) {
    email.put(num, new ArrayList<>()); 
}

email.get(num).add(val);
 

}


for (Map.Entry<Integer, ArrayList<String>> entry : email.entrySet()) {
    int key = entry.getKey();
    ArrayList<String> emailList = entry.getValue();
    Collections.sort(emailList);

    // Add the name of the user as the first item in the list
    String name = accounts.get(key).get(0);
    ArrayList<String> mergedAccount = new ArrayList<>();
    mergedAccount.add(name);
    mergedAccount.addAll(emailList);

    result.add(mergedAccount);
}
return result;
        
    }
}