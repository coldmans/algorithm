import sys
from collections import deque
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    s = input().strip()
    res = []
    tmp = deque()
    for i in range(len(s)):
        if s[i] == "<":
            if res:
                tmp.appendleft(res.pop())
        elif s[i] == ">":
            if tmp:
                res.append(tmp.popleft())
        elif s[i] == "-":
            if res:
                res.pop()
        else:
            res.append(s[i])
    while tmp:
        res.append(tmp.popleft())
    
    for i in range(len(res)):
        print(res[i],end = "")
    print()


