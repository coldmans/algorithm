import sys
input = sys.stdin.readline
from collections import deque
c = []
N = int(input().strip())
for i in range(N):
    c.append(int(input().strip()))
c.sort(reverse=True)
c = deque(c)
a = N % 3
tmp = 0

if a == 2:
    tmp += c.pop()
    tmp += c.pop()
elif a == 1:
    tmp += c.pop()

for i in range(N//3):
    c.pop()
    tmp += c.pop()
    tmp += c.pop()
print(tmp)

