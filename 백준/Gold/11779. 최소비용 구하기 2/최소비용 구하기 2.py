import sys
import heapq
input = sys.stdin.readline

def get_path(p, en):
    path = []
    while en != -1:
        path.append(en)
        en = p[en]
    path.reverse()
    return path

n = int(input().strip())
m = int(input().strip())

link = [[] for _ in range(n+1)]
dist = [float('inf')] * (n+1)
parent = [-1] * (n+1)
    
for _ in range(m):
    a, b, c = map(int, input().strip().split())
    link[a].append((b, c))

s, e = map(int, input().strip().split())
q = []
heapq.heappush(q, (0, s))
dist[s] = 0

while q:
    weight, node = heapq.heappop(q)
    
    if dist[node] < weight:
        continue
    
    for nxt, w in link[node]:
        if dist[node] + w < dist[nxt]:
            dist[nxt] = dist[node] + w
            heapq.heappush(q, (dist[nxt], nxt))
            parent[nxt] = node
            
if dist[e] == float('inf'):
    print("No path")
else:
    path = get_path(parent, e)
    print(dist[e])
    print(len(path))
    print(' '.join(map(str, path)))
