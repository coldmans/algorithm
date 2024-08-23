import sys
input = sys.stdin.readline

def calculate_g(n):
    divisor_sum = [0] * (n + 1)
    dp = [0] * (n+1)
    for i in range(1, n + 1):
        for j in range(i, n + 1, i):
            divisor_sum[j] += i
            dp[j] = dp[j-1] + divisor_sum[j]
    return dp
    
T = int(input().strip())
di = calculate_g(1000001)

for _ in range(T):
    n = int(input().strip())

    print(di[n])