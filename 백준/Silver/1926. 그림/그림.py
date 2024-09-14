import sys
from collections import deque
input = sys.stdin.readline

def recur(y,x):
    global visited
    ct = 1
    q = deque()
    q.append((y,x))
    while q:
        ky,kx = q.popleft()
        for dy, dx in ((1,0),(0,1),(-1,0),(0,-1)):
            cy = dy + ky
            cx = dx + kx
            if (0 <= cy < n) and (0 <= cx < m) and (dohwa[cy][cx] != 0) and (visited[cy][cx] == 0):
                visited[cy][cx] = 1
                ct += 1
                q.append((cy,cx))
    return ct
            

n, m = map(int, input().strip().split())
dohwa = [[int(x) for x in input().strip().split()] for _ in range(n)]
visited = [[int(0) for _ in range(m)] for _ in range(n)]

ctt = 0
cts = []
for i in range(n):
    for j in range(m):
        if visited[i][j] == 0 and dohwa[i][j] != 0:
            ctt += 1
            visited[i][j] = 1
            x = recur(i,j)
            cts.append(x)

print(ctt)
if cts:
    print(max(cts))
else:
    print(0)
