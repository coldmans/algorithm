import sys
import heapq
sys.setrecursionlimit(1000000)
input = sys.stdin.readline

dd= 0
maxt = -1
def recur(x,dxt,pr):
    global dd, maxt
    for i in range(len(graph[x])):
        if graph[x][i][1] == pr:
            continue
        recur(graph[x][i][1], dxt+graph[x][i][0], x)
    dd = max(dd,dxt)
    if dd == dxt:
        maxt = x

    



N = int(input().strip())
graph = [[] for _ in range(N+1)]
for _ in range(N):
    li = list(map(int, input().strip().split()))
    for i in range(1,len(li),2):
        if li[i] == -1:
            break
        heapq.heappush(graph[li[0]],(li[i+1],li[i]))
recur(1,0,-1)
recur(maxt,0,-1)
print(dd)


        