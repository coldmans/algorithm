import sys
input = sys.stdin.readline

N = int(input().strip())
card = list(map(int, input().strip().split()))
dp = [0 for _ in range(N+1)]

for i in range(1,len(dp)):
    tmp = 0
    for j in range(1,len(dp)):
        tmp = max(tmp, dp[j]+dp[i-j])
    dp[i] = max(card[i-1], tmp)
print(dp[-1])








