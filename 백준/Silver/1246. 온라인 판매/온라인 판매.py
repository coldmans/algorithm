import sys
from collections import deque
input = sys.stdin.readline

N, M = map(int, input().strip().split())
egg = []
for _ in range(M):
    egg.append(int(input().strip()))
egg.sort()
egg = deque(egg)

while N<M:
    egg.popleft()
    M -= 1

tmp = 0

for i in range(len(egg)-1):
    tmp = max(tmp, egg[i] * (len(egg)-i)) 
    if tmp == egg[i] * (len(egg)-i):
        prize = egg[i]
        

print(prize, tmp)
        




