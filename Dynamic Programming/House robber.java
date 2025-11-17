class Solution {
    public int houseRobber(int[] money) {
        int n = money.length;

        if(n == 1) return money[0];

        //Case 1: Include house 0
        int dp1[] = new int[n];
        dp1[0] = money[0];
        dp1[1] = Math.max(money[0],money[1]);

        for(int i = 2 ; i < n -1 ; i++) {
            dp1[i] = Math.max(money[i] + dp1[i-2] , dp1[i-1]);
        }

        //Case 2 Exclude house 0
        int dp2[] = new int[n];
        dp2[0] = 0;
        dp2[1] = money[1];

        for(int i = 2 ; i < n ; i++) {
            dp2[i] = Math.max(money[i] + dp2[i-2] , dp2[i-1]);
        }

        return Math.max(dp1[n-2] , dp2[n-1]);
    }
}
