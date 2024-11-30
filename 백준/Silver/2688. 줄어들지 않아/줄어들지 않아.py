import sys
input = sys.stdin.readline

N = int(input().strip())
dp = [[1e9,1e9, 1e9, 1e9, 1e9,1e9,1e9,1e9,1e9,1e9] for _ in range(1001)]
dp[1] = [1,1,1,1,1,1,1,1,1,1]
dp[2] = [10,9,8,7,6,5,4,3,2,1]
for i in range(2,1001):
    dp[i][0] = dp[i-1][0] + dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][1] = dp[i-1][1] + dp[i-1][2] + dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][2] = dp[i-1][2] + dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][3] = dp[i-1][3] + dp[i-1][4] + dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][4] = dp[i-1][4] + dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][5] = dp[i-1][5] + dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][6] = dp[i-1][6] + dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][7] = dp[i-1][7] + dp[i-1][8] + dp[i-1][9]
    dp[i][8] = dp[i-1][8] + dp[i-1][9]
    dp[i][9] = dp[i-1][9]
    

for _ in range(N):
    n = int(input().strip())
    print(sum(dp[n]))

