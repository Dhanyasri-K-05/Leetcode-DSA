class Solution {
    public int[] maxSubsequence(int[] nums, int k) {

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] - b[0]);

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[] { nums[i], i });
            if (pq.size() > k) {
                pq.poll();
            }

        }

        List<int[]> list = new ArrayList<>(pq);
        Collections.sort(list, (a, b) -> a[1] - b[1]);

        int result[] = new int[k];
        int i = 0;
        for (int[] n : list) {
            result[i] = n[0];
            i++;
        }
        return result;

    }
}