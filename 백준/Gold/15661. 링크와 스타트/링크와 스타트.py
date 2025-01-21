import sys
from itertools import combinations
input = sys.stdin.readline

N = int(input().strip())
li = [list(map(int, input().strip().split())) for _ in range(N)]
element = []
for i in range(N):
    element.append(i)
element = set(element)
maxi = 1e9
for i in range(1,N//2+1):
    for combo in combinations(range(N),i):

        comboset = set(combo)
        na = element - comboset
        tmp = 0
        tmp2 = 0
        for combos in combinations(comboset, 2):
            tmp += li[combos[0]][combos[1]]
            tmp += li[combos[1]][combos[0]]

        for combos in combinations(na,2):
            tmp2 += li[combos[0]][combos[1]]
            tmp2 += li[combos[1]][combos[0]]


        maxi = min(maxi, abs(tmp-tmp2))
print(maxi)