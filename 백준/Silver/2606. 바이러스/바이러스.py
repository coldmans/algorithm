import sys
input = sys.stdin.readline

visited = [0 for _ in range(101)]
ctt = -1
def dfs(a,v):
    global visited,ctt
    visited[v] = 1
    ctt += 1
    for i in range(a+1):
        if (graph[v][i] == 1) and (visited[i] != 1):
            dfs(a,i)


n = int(input().strip())
m = int(input().strip())

graph = [[0 for _ in range(101)] for _ in range(101)]

for _ in range(m):
    x,y = map(int, input().strip().split())
    graph[x][y] = 1
    graph[y][x] = 1
dfs(100,1)
print(ctt)