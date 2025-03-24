class Solution {
    public int countDays(int days, int[][] meetings) {
         Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0])); // Sort meetings by start time

        int start = -1, end = -1;
        int busyDays = 0;

        for (int[] meet : meetings) {
            int currStart = meet[0];
            int currEnd = meet[1];

            if (currStart > end) {  
                // No overlap, add previous interval length before updating
                if (start != -1) {
                    busyDays += (end - start + 1);
                }
                start = currStart;
                end = currEnd;
            } else {  
                // Overlapping intervals, merge them
                end = Math.max(end, currEnd);
            }
        }

        // Add last interval's busy days
        if (start != -1) {
            busyDays += (end - start + 1);
        }

        return days - busyDays;
    }
}