import sys
input = sys.stdin.readline

T = int(input().strip())
for _ in range(T):
    k = int(input().strip())
    n = int(input().strip())
    dp = [i for i in range(n+1)]
    
    for _ in range(k):
        for i in range(1,n+1):
            dp[i] = dp[i-1] + dp[i]
    print(dp[-1])
        