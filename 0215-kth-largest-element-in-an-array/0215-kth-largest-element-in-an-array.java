class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> p=new PriorityQueue<>(Collections.reverseOrder());

        for(int num:nums){
            p.add(num);
        }

        for(int i=0;i<k-1;i++){
            p.poll();
        }
        return p.poll();
    }
}