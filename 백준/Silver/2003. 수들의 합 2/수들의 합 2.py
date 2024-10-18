import sys
input = sys.stdin.readline

N,M=map(int, input().strip().split())
li = list(map(int,input().strip().split()))
ctt = 0
dp = [0 for _ in range(N+1)]
for i in range(1,len(li)+1):
    dp[i] += dp[i-1] + li[i-1]

i = 0
j = 0
while i != N:
    if dp[j] - dp[i] > M:
        i += 1
    else:     
        if dp[j] - dp[i] == M:
            ctt += 1
        if j < N:
            j += 1
        else:
            break

print(ctt)