import sys
input = sys.stdin.readline

def dfs(node, weight):
    for nxt, w in graph[node]:
        if visited[nxt] == 0:
            visited[nxt] = weight + w
            dfs(nxt, visited[nxt])
    return 


N, M = map(int, input().strip().split())
graph = [[] for _ in range(N+1)]
for _ in range(N-1):
    a,b,w = map(int, input().strip().split())
    graph[a].append((b,w))
    graph[b].append((a,w))
tmp = []
for _ in range(M):
    s,e = map(int ,input().strip().split())
    visited = [0] * (N+1)
    visited[s] = 1
    dfs(s,0)
    tmp.append(visited[e])

for i in tmp:
    print(i)

    
