class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long min = 0, max = 0, sum = 0;
        
        for (int diff : differences) {
            sum += diff;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

        // Calculate the valid starting range
        long validStartLow = lower - min;
        long validStartHigh = upper - max;

        if (validStartLow > validStartHigh) return 0;

        return (int)(validStartHigh - validStartLow + 1);
    }
}
