import sys
from collections import deque
input = sys.stdin.readline

N , M = map(int, input().strip().split())

tmp = [int(x) for x in input().strip().split()]

q = deque()
for i in range(1,N+1):
    q.append(i)

ctt = 0

for x in tmp:
    while 1:
        if q[0] == x:
            q.popleft()
            break
        else:
            a = q.index(x)
            b = len(q) - a
            if a <= b:
                q.rotate(-a)
                ctt += a
            else:
                q.rotate(b)
                ctt += b
        

print(ctt)