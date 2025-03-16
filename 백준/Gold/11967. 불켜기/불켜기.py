import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().strip().split())
li = [[[] for _ in range(N)] for _ in range(N)]
visited = [[0 for _ in range(N)]for _ in range(N)]
light = [[0 for _ in range(N)] for _ in range(N)]
for _ in range(M):
    x, y, a, b = map(int, input().strip().split())
    li[x-1][y-1].append((a-1,b-1))

visited[0][0] = 1
light[0][0] = 1
tmp = deque()
tmp.append((0,0))

while tmp:
    a, b = tmp.popleft()
    for i,j in li[a][b]:
        if light[i][j] == 0:
            light[i][j] = 1
            for dr, dc in [(-1,0),(1,0),(0,1),(0,-1)]:
                rr, cc = i + dr, j + dc
                if 0 <= rr < N and 0 <= cc < N and visited[rr][cc]:
                    visited[i][j] = 1
                    tmp.append((i,j))
                    break
    for di, dj in ((-1,0),(1,0),(0,1),(0,-1)):
        rj = b + dj
        ri = a + di
        if 0 <= rj < N and 0 <= ri < N and light[ri][rj] and visited[ri][rj] == 0:
            visited[ri][rj] = 1
            tmp.append((ri,rj))
                    

ans = 0
for i in range(N):
    for j in range(N):
        if light[i][j] == 1:
            ans += 1
print(ans)
