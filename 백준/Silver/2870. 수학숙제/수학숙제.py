import sys
input = sys.stdin.readline

li = []

N = int(input().strip())
for _ in range(N):
    mun = input().strip()
    stack = []
    for i in range(len(mun)):
        if mun[i].isdigit():
            if i < len(mun)-1 and mun[i+1].isdigit():
                if not stack and mun[i] == '0':
                    continue
                stack.append(mun[i])
                continue
            else:
                stack.append(mun[i])
                
                if stack:
                    tmp = 0
                    for i in range(len(stack)):
                        tmp += int(stack[i]) * (10 ** (len(stack)-i-1))
                    li.append(int(tmp))
                    stack = []
                else:
                    li.append(int(mun[i])) 
        else:
            if stack:
                tmp = 0
                for i in range(len(stack)):
                    tmp += int(stack[i]) * (10 ** (len(stack)-i-1))
                li.append(int(tmp))
                stack = []

li.sort()
for i in li:
    print(i)


    



