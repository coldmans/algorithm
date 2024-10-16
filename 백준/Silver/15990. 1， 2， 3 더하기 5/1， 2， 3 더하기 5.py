import sys
input = sys.stdin.readline

dp = []
dp.append((0,0,0))
dp.append((1,0,0))
dp.append((0,1,0))
dp.append((1,1,1))
dp.append((2,0,1))

for i in range(5,100001):
    dp.append(((dp[i-1][1] + dp[i-1][2])%1000000009, (dp[i-2][0] + dp[i-2][2])%1000000009 , (dp[i-3][0] + dp[i-3][1])%1000000009)) 

t = int(input().strip())
for _ in range(t):
    n = int(input().strip())
    print(sum(dp[n])%1000000009)
        






