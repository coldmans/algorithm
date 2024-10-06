import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
M = int(input().strip())
graph = [[] for _ in range(N+1)]

for _ in range(M):
    A,B,C = map(int, input().strip().split())
    graph[A].append([C,B])
    graph[B].append([C,A])
visited = [-1 for _ in range(N+1)]
q = [[0,1]]
anser = 0
ctt = 0
while q:
    if ctt == N:
        break
    weight, node = heapq.heappop(q)
    if visited[node] == -1:
        ctt += 1
        anser += weight
        visited[node] = 1
        for i in graph[node]:
            heapq.heappush(q,i)

print(anser)
    


    
