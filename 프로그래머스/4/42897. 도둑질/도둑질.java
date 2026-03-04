class Solution {
    public int solution(int[] money) {
        int answer = 0;
        int n = money.length;
        int []dp = new int[n];
        dp[0] = money[0];
        dp[1] = money[0];
        for(int i = 2; i < n-1; i++){
            dp[i] = Math.max(dp[i-1], dp[i-2] + money[i]);
        }
        
        int []dp2 = new int[n];
        dp2[0] = 0;
        dp2[1] = money[1];
        for(int i = 2; i < n; i++){
            dp2[i] = Math.max(dp2[i-1], dp2[i-2] + money[i]);
        }
        return Math.max(dp2[n-1], dp[n-2]);
        
    }
}