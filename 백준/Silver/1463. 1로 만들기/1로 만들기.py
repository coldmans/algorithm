import sys
import math
input = sys.stdin.readline

n = int(input().strip())

dp = [0 for _ in range(n+5)]
dp[0] = 0
dp[1] = 0
dp[2] = 1
dp[3] = 1

for i in range(4,n+1):
    dp[i] = dp[i-1] + 1
    if i % 2 == 0:
        dp[i] = min((dp[i]),(dp[i//2])+1)
    if i % 3 == 0:
        dp[i] = min((dp[i]), (dp[i//3])+1)

print(dp[n])