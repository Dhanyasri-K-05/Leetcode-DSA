class Pair{
    String s;
    int count;

    Pair(String s,int count){
        this.s=s;
        this.count=count;
    }
    }

class Solution {
    public int ladderLength(String begin, String end, List<String> wordList) {

        Queue<Pair> queue=new LinkedList<>();
        Set<String> set=new HashSet<>();
        for(String st:wordList){
            set.add(st);
        }
        queue.add(new Pair(begin,1));

        while(!queue.isEmpty()){
            Pair curr=queue.poll();
            String str=curr.s;
            int cnt=curr.count;

            if(str.equals(end)) return cnt;
      for(int i=0;i<begin.length();i++){
            for(char ch='a';ch<='z';ch++){
                char[] charr=str.toCharArray();
                charr[i]=ch;

                String fi=new String(charr);


                if(set.contains(fi)){
                    queue.add(new Pair(fi,cnt+1));
                    set.remove(fi);
                }

            }
        }
        }

        return 0;
    }
}