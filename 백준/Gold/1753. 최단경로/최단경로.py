import heapq
import sys
input = sys.stdin.readline
N,M = map(int, input().strip().split())
start = int(input().strip())
links = [[] for _ in range(N+1)]

dist = [1e9 for _ in range(N+1)] 
for _ in range(M):
    A,B,C = map(int, input().strip().split())
    links[A].append([B,C])

q = []
heapq.heappush(q,[0,start])
dist[start] = 0

while q:
    w,node = heapq.heappop(q)
    for nxt, weight in links[node]:
        if dist[node] + weight < dist[nxt]:
            dist[nxt] = dist[node] + weight
            heapq.heappush(q,[dist[nxt],nxt])
for x in range(1,len(dist)):
    if dist[x] == 1e9:
        print('INF')
    else:
        print(dist[x])