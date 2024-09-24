import sys
sys.setrecursionlimit(10 ** 7)

def dfs(x, turn):
    if x == e:
        return True
    visited[x] = 1
    cnt = 0
    for xx in graph[x]:
        if visited[xx] == 0:
            cnt += 1
    if turn % 2 == 0 and cnt > 1:
        return False
    tmp = False
    for xx in graph[x]:
        if visited[xx] != 0:
            continue
        tmp = tmp or dfs(xx, turn + 1)
    return tmp

n, s, e = map(int, input().split())
graph = [[] for _ in range(n + 1)]
for _ in range(n - 1):
    a, b = map(int, input().split())
    graph[a].append(b)
    graph[b].append(a)

visited = [0] * (n + 1)
if dfs(s, 1):
    print("First")
else:
    print("Second")