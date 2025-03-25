import sys
from collections import deque
input = sys.stdin.readline

M = int(input().strip())
li = list(map(int, input().strip().split()))

li.sort()
li = deque(li)
max = 0
if M % 2 == 1:
    max = li.pop()

while li:
    a = li.pop()
    b = li.popleft()
    if a + b > max:
        max = a + b
print(max)



    