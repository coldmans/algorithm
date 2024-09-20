import sys
input = sys.stdin.readline

n, k = map(int , input().strip().split())
coin = []
for _ in range(n):
    coin.append(int(input().strip()))

dp = [0] * (k+1)
dp[0] = 1

for i in coin:
    for j in range(len(dp)):
        if j >= i:
            dp[j] += dp[j-i]
print(dp[-1])











