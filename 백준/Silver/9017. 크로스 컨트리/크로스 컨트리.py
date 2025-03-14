import sys
input = sys.stdin.readline

test = int(input().strip())
for _ in range(test):
    N = int(input().strip())
    li = list(map(int, input().strip().split()))
    mt = max(li)
    goal = [-1 for _ in range(N+1)]
    stack = []
    for i in range(len(li)):
        if goal[li[i]] == 1:
            stack.append(li[i])
            continue
        elif goal[li[i]] == 0:
            continue
        else:
            if li.count(li[i]) < 6:
                goal[li[i]] = 0
            else:
                goal[li[i]] = 1
                stack.append(li[i])
    carry = {}
    tmp = [0 for _ in range(N+1)]
    hoxi = [0 for _ in range(N+1)]
    for i in range(len(stack)):
        if tmp[stack[i]] >= 4:
            if tmp[stack[i]] == 4:
                hoxi[stack[i]] = i+1
                tmp[stack[i]] += 1
            continue
        if stack[i] in carry:
            carry[stack[i]] += (i+1)
        else:
            carry[stack[i]] = i+1

        tmp[stack[i]] += 1

    mini = 1e9
    for key, val in carry.items():
        mini = min(mini, val)
    final = []
    for key, val in carry.items():
        if mini == val:
            final.append(key)
    
    mins = 1e9
    last = -1
    if len(final) >= 2:
        for i in final:
            if mins > hoxi[i]:
                mins = hoxi[i]
                last = i
        print(last)
    else:
        print(final[0])




