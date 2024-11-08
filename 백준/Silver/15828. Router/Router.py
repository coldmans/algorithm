import sys
from collections import deque
input = sys.stdin.readline

N = int(input().strip())
deq = deque()
while True:
    n = int(input().strip())
    if n == -1:
        break
    if n == 0:
        deq.popleft()
    else:
        if len(deq) < N:
            deq.append(n)
if deq:
    print(' '.join(map(str,deq)))
else:
    print("empty")
    

    
    











