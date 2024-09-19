import sys
input = sys.stdin.readline

N = int(input().strip())
K = int(input().strip())

if N <= K:
    print(0)
    sys.exit()

susin = sorted(list(map(int, input().strip().split())))
dp = [0] * (N+1)
for i in range(1,N):
    dp[i] = susin[i] - susin[i-1]
dp.sort()
for _ in range(K-1):
    dp.pop()
print(sum(dp))




