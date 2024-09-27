import sys
from itertools import combinations
input = sys.stdin.readline

def calculate_chicken_distance(chicken_comb):
    total_distance = 0
    for hx, hy in house:
        min_distance = float('inf')
        for cx, cy in chicken_comb:
            distance = abs(hx - cx) + abs(hy - cy)
            if distance < min_distance:
                min_distance = distance
        total_distance += min_distance
    return total_distance

N, M = map(int, input().strip().split())
home = [[int(x) for x in input().strip().split()] for _ in range(N)]
chic = []
house = []

for i in range(N):
    for j in range(N):
        if home[i][j] == 2:
            chic.append((i, j))
        elif home[i][j] == 1:
            house.append((i, j))

min_distance = float('inf')

for chicken_comb in combinations(chic, M):
    current_distance = calculate_chicken_distance(chicken_comb)
    if current_distance < min_distance:
        min_distance = current_distance

print(min_distance)