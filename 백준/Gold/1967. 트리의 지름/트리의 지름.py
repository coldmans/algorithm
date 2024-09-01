import sys
input = sys.stdin.readline
sys.setrecursionlimit(100000000)

def DFS(node,weight):
    for nxt, we in tree[node]:
        if visited[nxt] == -1:
            tmp = weight + we
            visited[nxt] = tmp
            DFS(nxt,tmp)
    return



N = int(input().strip())
tree = [[] for _ in range(N+1)]
for _ in range(N-1):
    a,b,w = map(int,input().strip().split())
    tree[a].append((b,w))
    tree[b].append((a,w))

visited = [-1] * (N+1)
visited[1] = 0
DFS(1,0)

idx = visited.index(max(visited))


visited = [-1] * (N+1)
visited[idx] = 0

DFS(idx,0)
print(max(visited))
