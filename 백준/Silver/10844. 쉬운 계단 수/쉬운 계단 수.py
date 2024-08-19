import sys
input = sys.stdin.readline

N = int(input().strip())
if N == 1:
    print(9)
    sys.exit()
dp = [1] * 10
dp[0] = 0
dp2 = [0] * 10
for j in range(1,N):
    if j % 2 == 1:
        for i in range(10):
            if i == 0:
                dp2[i+1] += dp[i]
            elif i == 9:
                dp2[i-1] += dp[i]
            else:
                dp2[i-1] += dp[i]
                dp2[i+1] += dp[i]
        dp = [0] * 10
    else:
        for i in range(10):
            if i == 0:
                dp[i+1] += dp2[i]
            elif i == 9:
                dp[i-1] += dp2[i]
            else:
                dp[i-1] += dp2[i]
                dp[i+1] += dp2[i]
        dp2 = [0] * 10
    
if N % 2 == 0:
    print(sum(dp2)%1000000000)
else:
    print(sum(dp)%1000000000)






