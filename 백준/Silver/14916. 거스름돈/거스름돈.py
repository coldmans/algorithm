import sys
input = sys.stdin.readline

N = int(input().strip())
dp = [1e9 for _ in range(N+5)]
dp[2] = 1
dp[4] = 2
dp[5] = 1

for i in range(6,N+1):
    if dp[i-2] == 1e9 and dp[i-5] == 1e9:
        continue
    dp[i] = min(dp[i-2],dp[i-5]) + 1

if dp[N] == 1e9:
    print(-1)
else:
    print(dp[N])



