import sys
input = sys.stdin.readline

N= int(input().strip())
tmp = []
dp = [1] * (N+1)
for _ in range(N):
    x = int(input().strip())
    tmp.append(x)

for i in range(1,N):
    for j in range(i):
        if tmp[i] > tmp[j]:
            dp[i] = max(dp[i],dp[j]+1)

print(len(tmp) - max(dp))