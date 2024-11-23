import sys
input = sys.stdin.readline

N, M = map(int, input().strip().split())

if N >= M:
    print(N - M)
    sys.exit()

dp = [1e9 for _ in range(M+10)]
for i in range(N+1):
    dp[i] = N-i

for i in range(N+1,M+10):
    if i % 2 == 0:
        dp[i] = min(dp[i//2], dp[i-1] + 1)
        if dp[i-1] > dp[i]:
            dp[i-1] = dp[i] + 1
    else:
        dp[i] = dp[i-1] + 1

print(dp[M])



