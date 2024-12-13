import sys
input = sys.stdin.readline
n = int(input().strip())
dp = [1 for _ in range(n+2)]
if n == 1:
    print(4)
    sys.exit()

for i in range(2,n):
    dp[i] = dp[i-1] + dp[i-2]

print(dp[n-1]*2 + (dp[n-1] + dp[n-2])*2)


