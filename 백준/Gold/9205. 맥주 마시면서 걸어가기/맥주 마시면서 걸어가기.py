import sys
from collections import deque
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    n = int(input().strip())
    pyun = []
    home = list(map(int, input().strip().split()))
    for _ in range(n):
        x,y = map(int, input().strip().split())
        pyun.append((x,y))
    pen = list(map(int, input().strip().split()))
    visited = set()
    ye = 0
    tmp = deque()
    tmp.append((home[0], home[1]))

    while tmp:
        x,y = tmp.popleft()
        
        if abs(pen[0] - x) + abs(pen[1] - y) <= 1000:
            print("happy")
            ye = 1
            break
        for dx,dy in pyun:
            if ((dx,dy)) not in visited and abs(x-dx) + abs(y-dy) <= 1000:
                tmp.append((dx,dy))
                visited.add((dx,dy))
                
    if ye == 0:
        print("sad")
