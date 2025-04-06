import sys
from collections import deque
input = sys.stdin.readline

T = int(input().strip())
directions = [(0,1),(0,-1),(1,0),(-1,0)]
for _ in range(T):
    w,h = map(int, input().strip().split())
    li = [[x for x in input().strip()] for _ in range(h)]
    fire_time = [[-1 for _ in range(w)] for _ in range(h)]
    sang_time = [[1e9 for _ in range(w)] for _ in range(h)]

    fire = deque()
    sang = deque()
    for i in range(h):
        for j in range(w):
            if li[i][j] == "*":
                fire.append((i,j))
                fire_time[i][j] = 0
            elif li[i][j] == "@":
                sang.append((i,j))
                sang_time[i][j] = 0


    while fire:
        fi, fj = fire.popleft()
        for di, dj in directions:
            nfi = fi + di 
            nfj = fj + dj
            if 0 <= nfi < h and 0<= nfj < w and fire_time[nfi][nfj] == -1 and (li[nfi][nfj] == "." or li[nfi][nfj] == "@"):
                fire_time[nfi][nfj] = fire_time[fi][fj] + 1
                fire.append((nfi,nfj))
            
    while sang:
        si, sj = sang.popleft()
        for di, dj in directions:
            nsi = si + di 
            nsj = sj + dj
            if 0 <= nsi < h and 0<= nsj < w and sang_time[nsi][nsj] == 1e9 and li[nsi][nsj] == "." and (sang_time[si][sj] + 1 < fire_time[nsi][nsj] or fire_time[nsi][nsj] == -1):
                sang_time[nsi][nsj] = sang_time[si][sj] + 1
                sang.append((nsi,nsj))
    
    maxi = 1e9
    for i in range(h):
        if i == 0:
            for j in range(w):
                maxi = min(maxi, sang_time[i][j])
        elif i == h-1:
            for j in range(w):
                maxi = min(maxi, sang_time[i][j]) 
        else:
            maxi = min(maxi, sang_time[i][0])
            maxi = min(maxi, sang_time[i][w-1])
    
    if maxi == 1e9:
        print("IMPOSSIBLE")
    else:
        print(maxi+1)
 





    
