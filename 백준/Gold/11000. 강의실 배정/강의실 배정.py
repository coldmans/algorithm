import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
gang = []
for _ in range(N):
    s, t = map(int,input().strip().split())
    gang.append((s,t))
gang.sort()
li = []
ctt = 0
for i,j in gang:
    a = 0
    if li and li[0] <= i:
        heapq.heappop(li)
        heapq.heappush(li,j)
    else:
        heapq.heappush(li,j)
        

print(len(li))
        


