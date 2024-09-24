import sys
from collections import deque
input = sys.stdin.readline

test = int(input().strip())

for _ in range(test):
    N, M = map(int, input().strip().split())
    mun = deque([(int(x), i) for i, x in enumerate(input().strip().split())])
    
    count = 0
    while mun:
        current = mun.popleft()
        if any(current[0] < item[0] for item in mun):
            mun.append(current)
        else:
            count += 1
            if current[1] == M:
                print(count)
                break