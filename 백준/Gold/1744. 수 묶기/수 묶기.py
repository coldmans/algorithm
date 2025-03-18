import sys
from collections import deque
input = sys.stdin.readline

N = int(input().strip())
li = []
zero = 0
for _ in range(N):
    li.append((int(input().strip())))
li.sort()
li = deque(li)
res = 0

while li:
    num = li.pop()
    if num > 1:
        if li:
            num2 = li.pop()
            if num2 > 1:
                res += num * num2
            else:
                res += num
                li.append(num2)
        else:
            res += num
    elif num == 1:
        res += 1

    elif num == 0:
        zero += 1
    else:
        li.append(num)
        break

while li:
    num = li.popleft()
    if li:
        num2 = li.popleft()
        res += num * num2
    else:
        if zero > 0:
            zero -= 1
        else:
            res += num
    
print(res)
