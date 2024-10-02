import sys
input = sys.stdin.readline

N = int(input().strip())
if N == 1:
    print(3)
    sys.exit()

dp = [0] * (N+1)
dp[1] = 3
dp[2] = 7
for i in range(3,N+1):
    dp[i] = dp[i-1] * 2 + dp[i-2]
    dp[i] = dp[i] % 9901
print(dp[N] % 9901)