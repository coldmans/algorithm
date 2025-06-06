import sys
input = sys.stdin.readline

N = int(input().strip())
li = list(map(int, input().strip().split()))
dp = [1 for _ in range(N+1)]
dp[0] = 1

for i in range(N):
    for j in range(i):
        if li[i] < li[j]:
            dp[i] = max(dp[i],dp[j]+1)

print(N-max(dp))
