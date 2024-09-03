import sys
input = sys.stdin.readline

N = int(input().strip())

nge = [int(x) for x in input().strip().split()]
stack = []
tmp = []

stack.append(nge[-1])
tmp.append(-1)

for i in range(len(nge)-2,-1,-1):
    if stack and stack[-1] > nge[i]:
        tmp.append(stack[-1])
        stack.append(nge[i])
    else:
        if not stack:
            tmp.append(-1)
            stack.append(nge[i])
        while stack:
            stack.pop()
            if stack and stack[-1] > nge[i]:
                tmp.append(stack[-1])
                stack.append(nge[i])
                break
            elif not stack:
                tmp.append(-1)
                stack.append(nge[i])
                break
            

for i in range(len(tmp)-1,-1,-1):
    print(tmp[i], end = " ")





            

