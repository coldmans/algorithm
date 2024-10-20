import sys
input = sys.stdin.readline

dp = []
dp.append(1)
dp.append(1)
dp.append(2)
dp.append(4)
dp.append(7)

for i in range(5,1000001):
    dp.append((dp[i-1]+dp[i-2]+dp[i-3])%1000000009)


N = int(input().strip())
for _ in range(N):
    n = int(input().strip())
    print(dp[n])
