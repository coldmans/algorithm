import sys
input = sys.stdin.readline

T = int(input().strip())
real = list(map(int, input().strip().split()))

print(min(real) * max(real))

