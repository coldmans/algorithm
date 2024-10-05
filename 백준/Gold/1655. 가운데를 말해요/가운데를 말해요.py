import sys
import heapq
input = sys.stdin.readline

N = int(input().strip())
maxq = []
minq = []
for i in range(N):
    heapq.heappush(maxq, -int(input().strip()))

    if minq and -maxq[0] > minq[0]:
        v = heapq.heappop(maxq)
        heapq.heappush(minq,-v)

    if len(maxq) < len(minq):
        v = heapq.heappop(minq)
        heapq.heappush(maxq,-v)
    elif len(maxq) > len(minq) + 1:
        v = heapq.heappop(maxq)
        heapq.heappush(minq,-v)
    print(-maxq[0])


    
