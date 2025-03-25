import sys
input = sys.stdin.readline

N, S = map(int, input().strip().split())
li = list(map(int ,input().strip().split()))
dp = [0 for _ in range(N+1)]
if S == 0:
    print(1)
    sys.exit()
for i in range(1,len(li)+1):
    dp[i] += dp[i-1] + li[i-1]

i = 0
j = 1
mins = 1e9
while i <= j:
    if dp[j] - dp[i] > S:
        mins = min(mins, j-i)
        i += 1
        if i == N+1:
            break
    elif dp[j] - dp[i] == S:
        mins = min(mins, j-i)
        i += 1
        j += 1
        if i == N+1 or j == N+1:
            break
    else:
        j += 1
        if j == N+1:
            break

if mins == 1e9:
    print(0)
else:
    print(mins)