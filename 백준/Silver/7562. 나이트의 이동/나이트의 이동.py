import sys
from collections import deque
input = sys.stdin.readline

test_case = int(input().strip())
for _ in range(test_case):
    l = int(input().strip())
    chase = [[0 for _ in range(l)] for _ in range(l)]
    sx, sy = map(int, input().strip().split())
    endx, endy = map(int, input().strip().split())
    tmp = deque()
    tmp.append((sy,sx))
    chase[sy][sx] = 1

    while tmp:
        y,x = tmp.popleft()
        if y == endy and x == endx:
            print(chase[y][x]-1)
            break
            
        for dy,dx in ((2,1),(1,2),(-1,2),(-2,1),(-2,-1),(-1,-2),(1,-2),(2,-1)):
            ey = dy + y
            ex = dx + x
            if 0 <= ey < l and 0 <= ex < l and chase[ey][ex] == 0:
                chase[ey][ex] = chase[y][x] + 1
                tmp.append((ey,ex))
    else:
        print(0)
                
