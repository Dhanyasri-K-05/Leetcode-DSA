class Solution {
    public int lastStoneWeight(int[] stones) {
PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        for(int num:stones){
            pq.add(num);
        }

        while(!pq.isEmpty() && pq.size()>=2){
            int lar=pq.poll();
            int small=pq.poll();

            if(lar!=small){
                pq.add(lar-small);
            }
        }

       return (pq.isEmpty()==true)?0:pq.peek(); 
    }
}