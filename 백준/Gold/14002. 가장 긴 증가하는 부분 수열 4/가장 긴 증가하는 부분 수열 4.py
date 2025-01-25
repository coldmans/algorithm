import sys
input = sys.stdin.readline

N = int(input().strip())
li = list(map(int, input().strip().split()))
dp = [[] for _ in range(N)]
dp[0].append(li[0])

for i in range(1,len(li)):
    for j in range(i):
        if li[i] > li[j]:
            if len(dp[i]) < len(dp[j])+1:
                dp[i] = dp[j][:]
                dp[i].append(li[i])
    if len(dp[i]) == 0:
        dp[i].append(li[i])
            
maxi = -1
maxilen = 0
for i in range(len(dp)):
    if len(dp[i]) > maxilen:
        maxi = i
        maxilen = len(dp[i])
        

print(len(dp[maxi]))
print(' '.join(map(str,dp[maxi]))) 

