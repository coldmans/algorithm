import sys
import heapq
input = sys.stdin.readline
i = 1
while 1:
    N = int(input().strip())
    if N == 0:
        break
    graph = [[int(x) for x in input().strip().split()] for _ in range(N)]
    direction = [(-1,0),(1,0),(0,1),(0,-1)]
    q = []
    dist = [[1e9 for _ in range(N)] for _ in range(N)]
    heapq.heappush(q, (graph[0][0],0,0))
    dist[0][0] = graph[0][0]
    while q:
        w,y,x = heapq.heappop(q)
        if dist[y][x] < w:
            continue
        for dy, dx in direction:
            zy = dy + y
            zx = dx + x
            if 0 <= zy < N and 0 <= zx < N:
                cost = w + graph[zy][zx]
                if cost < dist[zy][zx]:
                    dist[zy][zx] = cost
                    heapq.heappush(q,(cost, zy,zx))
    print(f"Problem {i}: {dist[N-1][N-1]}")
    i += 1
    




