import sys
from collections import deque

def bfs():
    queue = deque()
    queue.append((0,0,0,1))

    while queue:
        i, j, wall, dist = queue.popleft()
        if i == N-1 and j == M-1:
            return dist

        for di, dj in [(1,0),(0,1),(-1,0),(0,-1)]:
            zi = i + di
            zj = j + dj
            if (0 <= zi and zi < N) and (0 <= zj and zj < M):
                if li[zi][zj] == 0 and not visited[zi][zj][wall]:
                    visited[zi][zj][wall] = True
                    queue.append((zi, zj, wall, dist + 1))

                elif li[zi][zj] == 1 and wall == 0 and not visited[zi][zj][1]:
                    visited[zi][zj][1] = True
                    queue.append((zi, zj, 1, dist + 1))
    return -1



N, M = map(int, sys.stdin.readline().strip().split())
li = [list(map(int, list(sys.stdin.readline().strip()))) for _ in range(N)]
visited = [[[False]*2 for _ in range(M)] for _ in range(N)]
result = bfs()
print(result)






