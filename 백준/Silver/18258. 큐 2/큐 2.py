from collections import deque
import sys
input = sys.stdin.readline

N = int(input().strip())
tmp = deque()
for _ in range(N):
    test = input().strip().split()
    if test[0] == "push":
        tmp.append(test[1])
    elif test[0] == "front":
        if tmp:
            print(tmp[0])
        else:
            print(-1)
    elif test[0] == "back":
        if tmp:
            print(tmp[-1])
        else:
            print(-1)
    elif test[0] == "size":
        print(len(tmp))
    elif test[0] == "pop":
        if tmp:
            print(tmp.popleft())
        else:
            print(-1)
    elif test[0] == "empty":
        if tmp:
            print(0)
        else:
            print(1)