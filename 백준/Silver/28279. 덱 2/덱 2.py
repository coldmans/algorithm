import sys
from collections import deque
input = sys.stdin.readline

N = int(input().strip())
s = deque()
for _ in range(N):
    li = list(map(int ,input().strip().split()))
    if li[0] == 1:
        s.appendleft(li[1])
    elif li[0] == 2:
        s.append(li[1])
    elif li[0] == 3:
        if len(s):
            print(s.popleft())
        else:
            print(-1)
    elif li[0] == 4:
        if len(s):
            print(s.pop())
        else:
            print(-1)
    elif li[0] == 5:
        print(len(s))
    elif li[0] == 6:
        if len(s):
            print(0)
        else:
            print(1)
    elif li[0] == 7:
        if len(s):
            print(s[0])
        else:
            print(-1)
    elif li[0] == 8:
        if len(s):
            print(s[-1])
        else:
            print(-1)
