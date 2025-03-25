import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().strip().split())
graph = [[] for _ in range(N+1)]
indegree = [0] * (N+1)
for _ in range(M):
    A,B = map(int, input().strip().split())
    graph[A].append(B)
    indegree[B] += 1
q = deque()
for i in range(1, N+1):
    if indegree[i] == 0:
        q.append(i)
result = []
while q:
    cur = q.popleft()
    result.append(cur)
    for next in graph[cur]:
        indegree[next] -= 1
        if indegree[next] == 0:
            q.append(next)

print(*result)