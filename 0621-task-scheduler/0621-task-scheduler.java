class Pair{
    char ch;
    int freq;

    Pair(char ch,int freq){
        this.ch=ch;
        this.freq=freq;
    }
}



class Solution {
    public int leastInterval(char[] tasks, int n) {

        HashMap<Character,Integer> map=new HashMap<>();
        for(char ch:tasks){
            map.put(ch,map.getOrDefault(ch,0)+1);

        }

        PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->Integer.compare(b.freq,a.freq));
      Queue<Object[]> queue=new LinkedList<>();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            pq.offer(new Pair(entry.getKey(), entry.getValue()));
        }
    
       int time=0;


       while(!pq.isEmpty() || !queue.isEmpty()){
        time++;

        if(!pq.isEmpty()){
        Pair curr=pq.poll();
        
        curr.freq--;
        if(curr.freq>0)   queue.add(new Object[]{curr,time+n});
    // pq.offer(new Pair(curr.ch,curr.freq));
       }

        if(!queue.isEmpty() && (int)queue.peek()[1]==time ){
            Pair curr1=(Pair)queue.poll()[0];
            pq.add(curr1);
        }
       }


return time;

     
    }
}