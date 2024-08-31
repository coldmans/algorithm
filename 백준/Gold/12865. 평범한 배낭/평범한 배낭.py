import sys
input = sys.stdin.readline

N, K = map(int, input().strip().split())
items = []

for _ in range(N):
    W,V= map(int, input().strip().split())
    items.append((W,V))

dp = [0] * (K+1)

for W, V in items:
    for j in range(K, W-1, -1):
        dp[j] = max(dp[j], dp[j-W] + V)


print(max(dp))
