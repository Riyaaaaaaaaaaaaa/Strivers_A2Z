class Solution {
    public int frogJump(int[] heights, int k) {
        int n =  heights.length;

        int dp[] = new int[n];
        dp[0] = 0;

        for(int i = 1 ; i < n ; i++) {

            int min_Jump = Integer.MAX_VALUE;

            for(int j = 1 ; j <= k ; j++) {

                if(i - j >= 0) {
                    int jump = dp[i-j] + Math.abs(heights[i] - heights[i-j]);
                    min_Jump = Math.min(jump,min_Jump);
                }
            }

            dp[i] = min_Jump;
        }

        return dp[n-1];
    }
}
