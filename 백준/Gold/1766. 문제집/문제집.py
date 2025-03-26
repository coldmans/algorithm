import sys
import heapq
from collections import deque
input = sys.stdin.readline

N, M = map(int , input().strip().split())
li = [[] for _ in range(N)]
wee = [0 for _ in range(N)]
for _ in range(M):
    A,B = map(int, input().strip().split())
    wee[B-1] += 1
    li[A-1].append(B-1)

tmp = []
for i in range(N):
    if wee[i] == 0:
        heapq.heappush(tmp,i)

res = []

while tmp:
    s = heapq.heappop(tmp)
    res.append(s)
    for i in li[s]:
        wee[i] -= 1
        if wee[i] == 0:
            heapq.heappush(tmp,i)

for i in range(len(res)):
    print(res[i]+1, end = " ")