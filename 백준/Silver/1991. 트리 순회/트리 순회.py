import sys
input = sys.stdin.readline
N = int(input().strip())
graph = [[] for _ in range(130)]

for _ in range(N):
    a,b,c = map(str, input().strip().split())
    a = ord(a)
    b = ord(b)
    c = ord(c)

    graph[a].append(b)
    graph[a].append(c)

def recur(node):
    if node == 46:
        return
    print(chr(node),end = "")
    recur(graph[node][0])
    recur(graph[node][1])

def recur2(node):
    if node == 46:
        return
    
    recur2(graph[node][0])
    print(chr(node),end = "")
    recur2(graph[node][1])

def recur3(node):
    if node == 46:
        return
    
    recur3(graph[node][0])
    recur3(graph[node][1])
    print(chr(node),end = "")

recur(65)
print()
recur2(65)
print()
recur3(65)