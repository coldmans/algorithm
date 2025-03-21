import sys
from collections import deque
input = sys.stdin.readline

directions = [(0,-1),(-1,-1),(-1,0),(-1,1),(0,1),(1,1),(1,0),(1,-1)]
N,M = map(int, input().strip().split())
A = [[int(i) for i in input().strip().split()] for _ in range(N)]

goo = deque()
goo.append((N-1,0))
goo.append((N-1,1))
goo.append((N-2,0))
goo.append((N-2,1))

for _ in range(M):
    time = len(goo)
    d,s = map(int, input().strip().split())
    d -= 1
    di,dj = directions[d][0] * s, directions[d][1] * s
    boksa = []
    for _ in range(time):
        i,j = goo.pop()
        ri,rj = di+i, dj+j
        ri = (i + di) % N
        rj = (j + dj) % N

        A[ri][rj] += 1
        boksa.append((ri,rj))
    for (i,j) in boksa:
        if i-1 >= 0 and j-1 >= 0 and A[i-1][j-1] > 0:
            A[i][j] += 1
        if i+1 < N and j+1 < N and A[i+1][j+1] > 0:
            A[i][j] += 1
        if i-1 >= 0 and j+1 < N and A[i-1][j+1] > 0:
            A[i][j] += 1
        if i+1 < N and j-1 >= 0 and A[i+1][j-1] > 0:
            A[i][j] += 1
    goo = deque()
    boksa_set = set(boksa)
    for i in range(N):
        for j in range(N):
            if A[i][j] >= 2 and (i,j) not in boksa_set:
                A[i][j] -= 2
                goo.append((i,j))

res = 0
for i in range(N):
    for j in range(N):
        res += A[i][j]

print(res)






