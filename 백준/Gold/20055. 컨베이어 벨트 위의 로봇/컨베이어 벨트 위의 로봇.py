import sys
from collections import deque
input = sys.stdin.readline

N,K = map(int, input().strip().split())
zero = 0
res = 0
li = map(int, input().strip().split())
li = deque(li)
li2 = deque()
for _ in range(N):
    li2.append(li.pop())
while 1:
    res += 1
    li2.append(li.pop())
    li.appendleft(li2.popleft())

    if li[-1] < 0:
        li[-1] *= -1
    
    if li[-1] == 1001:
        li[-1] = 0

    for i in range(N-1,-1,-1):
        if li[i] == 1001:
            if li[i+1] > 0 and li[i+1] < 1001:
                li[i+1] -= 1
                li[i+1] *= -1
                li[i] = 0
                if li[i+1] == 0:
                    zero += 1
                    li[i+1] = 1001
                if i+1 == N-1:
                    if li[i+1] < 0:
                        li[i+1] *= -1
                    elif li[i+1] == 1001:
                        li[i+1] = 0
        elif li[i] < 0:
            if li[i+1] > 0 and li[i+1] < 1001:
                li[i] *= -1
                li[i+1] -= 1
                li[i+1] *= -1
                if li[i+1] == 0:
                    zero += 1
                    li[i+1] = 1001
                if i+1 == N-1:
                    if li[i+1] < 0:
                        li[i+1] *= -1
                    elif li[i+1] == 1001:
                        li[i+1] = 0

    if li[0] > 0 and li[0] < 1001:
        li[0] -= 1
        li[0] *= -1
        if li[0] == 0:
            zero += 1
            li[0] = 1001

    if zero >= K:
        print(res)
        sys.exit()




    