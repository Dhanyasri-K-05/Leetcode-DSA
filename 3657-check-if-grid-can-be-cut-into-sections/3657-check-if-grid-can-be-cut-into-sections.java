class Pair{
    int first;
    int second;

    Pair(int first,int second){
        this.first=first;
        this.second=second;
    }
}


class Solution {
    public boolean checkValidCuts(int n, int[][] rectangles) {

      ArrayList<Pair> xlist=new ArrayList<>();
      ArrayList<Pair> ylist=new ArrayList<>();

      for(int[] rec:rectangles){
        xlist.add(new Pair(rec[0],1));
        xlist.add(new Pair(rec[2],0));
        ylist.add(new Pair(rec[1],1));
        ylist.add(new Pair(rec[3],0));
      }

    Collections.sort(xlist, (a, b) -> a.first == b.first ? Integer.compare(a.second, b.second) : Integer.compare(a.first, b.first));
Collections.sort(ylist, (a, b) -> a.first == b.first ? Integer.compare(a.second, b.second) : Integer.compare(a.first, b.first));


      return overlap(xlist)||overlap(ylist);


        
    }


    boolean overlap(List<Pair> list){

        int overl=0;
        int lines=0;

        for(Pair ans:list){
            if(ans.second==0){
                overl--;
            }else{
                overl++;
            }

            if(overl==0) lines++;
        }

        return lines>=3;
    }
}