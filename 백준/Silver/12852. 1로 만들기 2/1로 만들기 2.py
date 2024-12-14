import sys
input = sys.stdin.readline

n = int(input().strip())
dp = [0 for _ in range(n+1)]
path = [0 for _ in range(n+1)]

for i in range(2, n+1):
    dp[i] = dp[i-1] + 1
    path[i] = i-1
    if i % 2 == 0 and dp[i] > dp[i//2] + 1:
        dp[i] = dp[i//2] + 1
        path[i] = i//2
    if i % 3 == 0 and dp[i] > dp[i//3] + 1:
        dp[i] = dp[i//3] + 1
        path[i] = i//3

print(dp[n])

result = []
while n > 0:
    result.append(n)
    n = path[n]
print(' '.join(map(str, result)))


