class Solution {
    public int frogJump(int[] heights) {
        int n = heights.length;

        int dp[] = new int[n];

        dp[0] = 0;

        for(int i = 1 ; i < n ; i++) {
            int oneJump = dp[i-1] + Math.abs(heights[i] - heights[i-1]);
            
            // Jump from two steps back (i-2) - only if it exists
            int twoJump = Integer.MAX_VALUE;
            if(i > 1) {
                twoJump = dp[i-2] + Math.abs(heights[i] - heights[i-2]);
            }
            
            dp[i] = Math.min(oneJump, twoJump);
        }
        return dp[n-1];
    }
}
