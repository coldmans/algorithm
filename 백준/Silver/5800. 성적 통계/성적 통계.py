import sys
from collections import deque
input = sys.stdin.readline

K = int(input().strip())

for i in range(K):
    grade = deque(list(map(int, input().strip().split())))
    n = grade.popleft()
    grade = list(grade)
    
    l = max(grade)
    s = min(grade)
    grade.sort()
    gap = 0
    for j in (range(1,len(grade))):
        if gap < (grade[j] - grade[j-1]):
            gap = grade[j] - grade[j-1]
    print(f'Class {i+1}')
    print(f'Max {l}, Min {s}, Largest gap {gap}')

