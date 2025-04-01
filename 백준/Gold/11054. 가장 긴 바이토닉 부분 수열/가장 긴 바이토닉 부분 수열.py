import sys
input = sys.stdin.readline

N = int(input().strip())
li = list(map(int, input().strip().split()))
dp = [1 for _ in range(N)]
dp2 = [1 for _ in range(N)]

for i in range(1,N):
    for j in range(i-1,-1,-1):
        if li[i] > li[j]:
            dp[i] = max(dp[i], dp[j] + 1)
            

for i in range(N-1, -1, -1):
    for j in range(i+1,N):
        if li[i] > li[j]:
            dp2[i] = max(dp2[i], dp2[j]+1)
maxi = 0
for i in range(N):
    maxi = max(maxi, dp[i]+dp2[i])

print(maxi-1)