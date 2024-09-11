import sys
input = sys.stdin.readline
from collections import deque

dx = [0,0,-1,1]
dy = [1,-1,0,0]

def graph(ex,ey):
    global grid
    global visited
    area = 0
    q = deque()
    q.append((ex,ey))
    visited[ey][ex] = 1
    while q:
        x,y = q.popleft()
        area += 1
        for i in range(4):
            cx,cy = x + dx[i], y + dy[i]
            if (0 <= cx < N)  and (0<= cy < M) and (not grid[cy][cx]) and (not visited[cy][cx]):
                q.append((cx,cy))
                visited[cy][cx] = 1
                
    return area




M,N,K = map(int, input().strip().split())
grid = [[0] * N for _ in range(M)]
visited = [[0 for _ in range(N)] for _ in range(M)]
for _ in range(K):
    x1,y1,x2,y2 = map(int, input().strip().split())
    for i in range(y1,y2):
        for j in range(x1,x2):
            grid[i][j] = 1

areas = []
for i in range(M):
    for j in range(N):
        if not visited[i][j] and not grid[i][j]:
            visited[i][j] = 1
            areas.append(graph(j,i))

areas.sort()
print(len(areas))
print(' '.join(map(str,areas)))
