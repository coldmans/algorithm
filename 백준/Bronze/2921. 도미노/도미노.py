import sys
input = sys.stdin.readline
N = int(input().strip())
tmp = 0
for i in range(N+1):
    for j in range(i,N+1):
        tmp += i+j
print(tmp)
        




