import sys
input = sys.stdin.readline

n, k = map(int , input().strip().split())
coin = []

for _ in range(n):
    coin.append(int(input().strip()))
dp = [1e9] * (k+1)
dp[0] = 0

for i in range(1,len(dp)):
    for j in coin:
        if i >= j:
            dp[i] = min(dp[i], dp[i-j]+1)

if dp[-1] == 1e9:
    print(-1)
else:
    print(dp[-1])










