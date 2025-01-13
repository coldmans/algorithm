import sys
import math
input = sys.stdin.readline

N = int(input().strip())
dp = [i for i in range(N+1)]
dp[0] = 0
x = int(math.sqrt(N))

for i in range(1,len(dp)):
    for j in range(2,x+1):
        if i == j ** 2:
            dp[i] = 1
        dp[i] = min(dp[i], dp[i-1]+1, dp[i-j**2] + dp[j**2])

print(dp[-1])





