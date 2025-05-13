class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];

        // Memo arrays for each case
        Integer[] dp1 = new Integer[n];
        Integer[] dp2 = new Integer[n];

        // Case 1: Rob houses from 0 to n-2
        int case1 = robRange(nums, 0, n - 2, dp1);
        // Case 2: Rob houses from 1 to n-1
        int case2 = robRange(nums, 1, n - 1, dp2);

        return Math.max(case1, case2);
    }

    private int robRange(int[] nums, int start, int end, Integer[] dp) {
        if (end < start) return 0;
        if (dp[end] != null) return dp[end];

        if (end == start) return nums[start];
        if (end == start + 1) return Math.max(nums[start], nums[start + 1]);

        int pick = nums[end] + robRange(nums, start, end - 2, dp);
        int nonPick = robRange(nums, start, end - 1, dp);

        dp[end] = Math.max(pick, nonPick);
        return dp[end];
    }
}
