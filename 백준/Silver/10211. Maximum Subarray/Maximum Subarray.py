import sys
input = sys.stdin.readline

t = int(input().strip())
for _ in range(t):
    n = int(input().strip())
    tmp = list(map(int, input().strip().split()))
    for i in range(1,len(tmp)):
        if tmp[i-1] > 0:
            tmp[i] += tmp[i-1]
    print(max(tmp))
        






