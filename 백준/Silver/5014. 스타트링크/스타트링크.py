import sys
from collections import deque
input = sys.stdin.readline

F,S,G,U,D = map(int, input().strip().split())

if S == G:
    print(0)
    sys.exit()
par = [1e9] * (F+1)
q = deque()
q.append((S,0))

while q:
    x,w = q.popleft()
    for ex in (U,-D):
        if (0 < ex + x <= F):
            if par[ex+x] > w+1:
                par[ex+x] = w+1
                q.append((ex+x, w+1))
if par[G] == 1e9:
    print("use the stairs")
else:
    print(par[G])

            







