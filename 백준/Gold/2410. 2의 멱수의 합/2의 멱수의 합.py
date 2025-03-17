import sys
input = sys.stdin.readline

N = int(input().strip())
dp = [0 for _ in range(N+1)]
dp[0] = 1
i = 1
while i <= N: 
    for j in range(1,N+1):
        if j-i < 0:
            continue
        dp[j] += dp[j-i]
        dp[j] = dp[j] % 1000000000 
    i = i * 2

print(dp[-1])


