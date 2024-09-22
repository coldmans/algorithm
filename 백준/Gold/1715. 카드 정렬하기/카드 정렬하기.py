import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
tmp = []
for _ in range(N):
    heapq.heappush(tmp,int(input().strip()))

res = 0
while len(tmp) != 1:
    a = heapq.heappop(tmp)
    b = heapq.heappop(tmp)
    res += a+b
    heapq.heappush(tmp,a+b)
    
print(res)

