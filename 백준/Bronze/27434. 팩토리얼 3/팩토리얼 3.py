import sys

N = int(sys.stdin.readline())

tmp = 1
for i in range(1, N+1):
    tmp *= i

print(tmp)