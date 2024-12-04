import sys
input = sys.stdin.readline

N = int(input().strip())
stack = []
for _ in range(N):
    li = list(map(int, input().strip().split()))
    
    if li[0] == 1:
        stack.append(li[1])
    elif li[0] == 2:
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif li[0] == 3:
        print(len(stack))
    elif li[0] == 4:
        if len(stack) == 0:
            print(1)
        else:
            print(0)
    elif li[0] == 5:
        if len(stack) != 0:
            print(stack[-1])
        else:
            print(-1)





