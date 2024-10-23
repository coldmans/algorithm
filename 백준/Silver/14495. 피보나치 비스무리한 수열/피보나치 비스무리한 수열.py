import sys
input = sys.stdin.readline

N = int(input().strip())
dp = [0 for _ in range(N+3)]
dp[0] = 0
dp[1] = 1
dp[2] = 1

for i in range(3,N+1):
    dp[i] = dp[i-1] + dp[i-3]

print(dp[N])
