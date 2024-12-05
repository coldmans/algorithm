import sys
input = sys.stdin.readline

N,M= map(int, input().strip().split())
dp = [[1 for _ in range(M+1)] for _ in range(N+1)]


for i in range(1,N+1):
    for j in range(1,M+1):
        dp[i][j] = (dp[i-1][j] + dp[i-1][j-1] + dp[i][j-1]) % 1000000007

print(dp[N-1][M-1])





