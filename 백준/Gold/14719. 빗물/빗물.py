import sys
from collections import deque
input = sys.stdin.readline

H, W = map(int ,input().strip().split())
li = list(map(int, input().strip().split()))

top = li[0]
stack = deque()
res = 0
for i in range(1,W):
    if li[i] < top:
        stack.append(li[i])
        if i == W - 1:
            if stack:
                top = max(stack)
                while stack:
                    tmp = stack.popleft()
                    if top == tmp:
                        if stack:
                            top = max(stack)
                    else:
                        res += top - tmp

    elif li[i] == top:
        while stack:
            res += top - stack.pop()
    elif li[i] > top:
        while stack:
            res += top - stack.pop()
        top = li[i]

    
    
print(res)





    