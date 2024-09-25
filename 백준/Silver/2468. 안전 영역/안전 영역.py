import sys
from collections import deque
input = sys.stdin.readline

def recur(i,j,x,vi):
    vi[i][j] = 1
    t = deque()
    t.append((i,j))

    while t:
        xi,xj = t.popleft()
        for dx, dy in ((-1,0),(1,0),(0,1),(0,-1)):
            di = xi + dx
            dj = xj + dy
            if 0 <= di < N and 0 <= dj < N and vi[di][dj] == 0 and link[di][dj] > x:
                vi[di][dj] = 1
                t.append((di,dj))


def safe(x):
    ctt = 0
    visited = [[0 for _ in range(N)] for _ in range(N)]
    for i in range(N):
        for j in range(N):
            if visited[i][j] == 0 and link[i][j] > x:
                ctt += 1
                recur(i,j,x,visited)
    return ctt


N = int(input().strip())
link = [[int(x) for x in input().strip().split()] for _ in range(N)]
maxi = 0
for i in range(N):
    for j in range(N):
        maxi = max(link[i][j],maxi)
maxim = 0
for i in range(maxi):
    maxim = max(maxim,safe(i))

print(maxim)