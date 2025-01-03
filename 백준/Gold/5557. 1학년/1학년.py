import sys
input = sys.stdin.readline

N = int(input().strip())

li = [int(x) for x in input().strip().split()]
dp = [[0 for _ in range(21)] for _ in range(N)]
dp[0][li[0]] = 1
for i in range(1,len(li)-1):
    for j in range(21):
        if dp[i-1][j] != 0:
            if j + li[i] <= 20:
                dp[i][j+li[i]] += dp[i-1][j]
            if j - li[i] >= 0:
                dp[i][j-li[i]] += dp[i-1][j]
         
print(dp[N-2][li[-1]])




