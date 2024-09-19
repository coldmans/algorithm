import sys
from collections import deque
input = sys.stdin.readline

N = int(input().strip())

tmp = deque()
tmp2 = deque()
li = sorted(list(int(x) for x in input().strip().split()))
li = deque(li)
li2 = deque(li)

res2 = 0
tmp2.append(li2.popleft())
tmp2.appendleft(li2.pop())
tmp2.append(li2.pop())

while li2:
    if li2:
        tmp2.appendleft(li2.popleft())
    if li2:
        tmp2.append(li2.popleft())
    if li2:
        tmp2.appendleft(li2.pop())
    if li2:
        tmp2.append(li2.pop())

for i in range(N-1):
    res2 += abs(tmp2[i+1] - tmp2[i])


tmp.append(li.pop())
tmp.appendleft(li.popleft())
tmp.append(li.popleft())

while li:
    if li:
        tmp.appendleft(li.pop())
    if li:
        tmp.append(li.pop())
    if li:
        tmp.appendleft(li.popleft())
    if li:
        tmp.append(li.popleft())
res = 0
for i in range(N-1):
    res += abs(tmp[i+1] - tmp[i])

print(max(res2,res))












