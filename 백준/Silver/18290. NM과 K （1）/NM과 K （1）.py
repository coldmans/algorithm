import sys
from itertools import combinations
input = sys.stdin.readline

N, M, K = map(int, input().split())
grid = [list(map(int, input().split())) for _ in range(N)]

cells = []
for r in range(N):
    for c in range(M):
        cells.append((r, c))

answer = -10_000_000_0 

for combo in combinations(range(N*M), K):

    pick_positions = [cells[idx] for idx in combo]

    valid = True
    for i in range(K):
        r1,c1 = pick_positions[i]
        for j in range(i+1, K):
            r2,c2 = pick_positions[j]
            if abs(r1-r2) + abs(c1-c2) == 1:
                valid = False
                break
        if not valid:
            break
    
    if not valid:
        continue
 
    s = 0
    for r,c in pick_positions:
        s += grid[r][c]
    # 5) 최대값 갱신
    if s > answer:
        answer = s

print(answer)