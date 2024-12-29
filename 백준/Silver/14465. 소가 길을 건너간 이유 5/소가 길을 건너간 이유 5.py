import sys
input = sys.stdin.readline

N, K, B = map(int, input().strip().split())
broken = [0] * (N + 1)

for _ in range(B):
    x = int(input().strip())
    broken[x] = 1

current_broken = sum(broken[1:K+1])
min_broken = current_broken

for i in range(2, N - K + 2):
    current_broken = current_broken - broken[i - 1] + broken[i + K - 1]
    min_broken = min(min_broken, current_broken)

print(min_broken)
