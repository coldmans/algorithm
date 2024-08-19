import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
M = int(input().strip())
link = [[] for _ in range(N+1)]
dist = [1e9 for _ in range(N+1)]
visited = [False] * (N+1)
for _ in range(M):
    a,b,c = map(int, input().strip().split())
    link[a].append((b,c))
s,e = map(int, input().strip().split())
q = []
heapq.heappush(q,[0,s])
dist[s] = 0
while q:
    w,node = heapq.heappop(q)
    if visited[node]:
        continue
    visited[node] = True
    for nxt, weight in link[node]:
        if dist[node] + weight < dist[nxt]:
            dist[nxt] = dist[node] + weight
            heapq.heappush(q,[dist[nxt],nxt])

print(dist[e])




