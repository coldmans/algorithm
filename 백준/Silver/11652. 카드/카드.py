import sys
input = sys.stdin.readline

N = int(input().strip())
li = {}
for _ in range(N):
    n = int(input().strip())
    if n in li:
        li[n] += 1
    else:
        li[n] = 1
maxi = -1e9
ind = -1e9
for i,m in li.items():
    if m > maxi or (m == maxi and ind > i):
        maxi = m
        ind = i

print(ind)

