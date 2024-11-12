import sys
import heapq
input = sys.stdin.readline

n,m = map(int, input().strip().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    a,b,w = map(int, input().strip().split())
    graph[a].append([b,w])
    graph[b].append([a,w])
    
s,t = map(int, input().strip().split())

q = []
heapq.heappush(q,[0,s])
dist = [1e9 for _ in range(n+1)]
dist[s] = 0
while q:
    w,node = heapq.heappop(q)
    for nxt,weight in graph[node]:
        if dist[node] + weight < dist[nxt]:
            dist[nxt] = dist[node] + weight
            heapq.heappush(q,[dist[nxt],nxt])

print(dist[t])

