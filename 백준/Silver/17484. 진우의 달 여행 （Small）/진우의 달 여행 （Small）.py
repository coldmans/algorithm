import sys
input = sys.stdin.readline

N,M = map(int, input().strip().split())
li = [[int(i) for i in input().strip().split()] for _ in range(N)]
dp = [[[1e9 for _ in range(3)] for _ in range(M)] for _ in range(N)]
for i in range(3):
    for j in range(M):
        dp[0][j][i] = li[0][j]

for i in range(1,N):
    for j in range(M):
        for k in range(3):
            if k == 0:
                if j == 0:
                    continue
                dp[i][j][k] = min(dp[i-1][j-1][1], dp[i-1][j-1][2]) + li[i][j]
            elif k == 1:
                dp[i][j][k] = min(dp[i-1][j][0], dp[i-1][j][2]) + li[i][j]
            else:
                if j == M-1:
                    continue
                dp[i][j][k] = min(dp[i-1][j+1][0], dp[i-1][j+1][1]) + li[i][j]
mins = 1e9
for i in range(M):
    for j in range(3):
        if dp[N-1][i][j] < mins:
            mins = dp[N-1][i][j]

print(mins)



