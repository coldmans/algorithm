import sys
input = sys.stdin.readline
sys.setrecursionlimit(1000000)
N = int(input().strip())
graph = [[] for _ in range(N+1)]
par = [0 for _ in range(N+1)]

for _ in range(N-1):
    a,b = map(int, input().strip().split())
    graph[a].append(b)
    graph[b].append(a)
    

def recur(node,prv):
    par[node] = prv
    for nxt in graph[node]:
        if nxt == prv:
            continue
        recur(nxt,node)

recur(1,0)
for i in range(2,len(par)):
    print(par[i])


