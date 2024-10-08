import sys
input = sys.stdin.readline

N = int(input().strip())
graph = [[int(x) for x in input().strip().split()] for _ in range(N)]

for k in range(N):  # 경유 노드
    for i in range(N):  # 출발 노드
        for j in range(N):  # 도착 노드
            if graph[i][k] == 1 and graph[k][j] == 1:
                graph[i][j] = 1

for i in range(N):
    for j in range(N):
        print(graph[i][j], end=" ")
    print()
