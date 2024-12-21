import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().strip().split())
gwa = []
new = deque()
a = 0
b = 0
di = 0
score = 0
tmp = 0
for _ in range(N):
    x,y = map(int, input().strip().split())
    gwa.append((x,y))
for _ in range(M):
    x,y = map(int,input().strip().split())
    new.append((x,y))

for _ in range(M):
    for i in range(N):
        ucli = ((gwa[i][0] - a)**2 + (gwa[i][1] - b) ** 2) 
        tmp = max(tmp, ucli)
        if tmp == ucli:
            dx = gwa[i][0]
            dy = gwa[i][1]
            di = i
    a = dx
    b = dy
    gwa[di] = new.popleft()
    score += tmp
    tmp = 0

print(score)
