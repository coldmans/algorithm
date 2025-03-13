import sys
from collections import deque
input = sys.stdin.readline

move = [(-2,-1),(-2, 1),(0, 2), (0, -2), (2, -1), (2, 1)]

N = int(input().strip())
r1,c1,r2,c2 = map(int, input().strip().split())
crack = deque([(r1, c1, 0)])
visited = [[-1 for _ in range(N)] for _ in range(N)]
res = []
while crack:
    a, b, ctt = crack.popleft()
    if a == r2 and b == c2:
        print(ctt)
        break
    for i, j in move:
        r = i + a
        c = j + b
        if 0 <= r < N and 0 <= c < N and visited[r][c] == -1:
            visited[r][c] = 1
            crack.append((r,c,ctt+1))
else:
    print(-1)
