import sys
input = sys.stdin.readline

N = int(input().strip())
graph = []
for _ in range(N):
    x,y = map(int, input().strip().split())
    graph.append((x,y))

graph.sort(key = lambda x : (x[1],x[0]))

for x,y in graph:
    print(x,y)

            

